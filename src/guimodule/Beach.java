package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class Beach extends PApplet{
	PImage img;
	public void setup(){
		size(400,400);//set canvas size
		background(255);//set canvas colour
		stroke(0);//set pen colour
		img =loadImage("https://c.tadst.com/gfx/600x337/barcelona-morning-sky.jpg?1","jpg");
		img.resize(0, height);//resize image to full size of the canvas
		image(img,0,0);//display image
	}
	public void draw(){
		int[] color= sunColorSec(second());//calculate colour code for sun
		fill(color[0],color[1],color[2]);//set sun colour
		ellipse(width/4,height/5,width/4,height/5);//draw sun
	}
	public int[] sunColorSec(float seconds) {
		int[] rgb=new int[3];
		//scale the brightness of colors based on seconds.
		// 30 seconds is black, 0 second is bright yellow
		float diffFrom30=Math.abs(30-seconds);
		float ratio=diffFrom30/30;
		rgb[0]=(int)(255*ratio);
		rgb[1]=(int)(255*ratio);
		rgb[2]=0;
		return rgb;
		
	}
}
