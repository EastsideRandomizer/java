public class rectangle2 {
	/* Their lifetime is as long as this class exist */
	private int height;
	private int width;
	
	/* A constructor has a same name as a class and it has no return type */
	public rectangle2 (int initHeight, int initWidth){
		height = initHeight;
		width = initWidth;
		}
	
	/* The public methods a accessible from code outside the class */
	public int computeArea(){
		return height * width;
	}
	public int computePerimeter(){
		return 2 * (height + width); 
	}
	
	public int getHeight(){
		return height;
	}

	public void setHeight(int newHeight){
		if ( newHeight > 0 && newHeight  <= 100){
			height = newHeight;
		}
	}

	public int getWidth(){
		return width;
	}

	public void setWidth(int newWidth){
		if ( newWidth > 0 && newWidth  <= 100){
			height = newWidth;
		}
	}
   
}
