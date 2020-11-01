package guimodule;
import processing.core.*;

public class MyDisplay extends PApplet{
	public void setup(){
		size(400,400);
		background(200,200,200);
	}
	public void draw(){
//		fill(255,255,0);
		int[] color= sunColorSec(second());//calculate colour code for sun
		fill(color[0],color[1],color[2]);//set sun colour
		ellipse(200,200,390,390);
		fill(0,0,0);
		ellipse(120,130,50,70);
		ellipse(280,130,50,70);
		ellipse(200,200,30,30);
		arc(200,280,120,100,0,PI);
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
