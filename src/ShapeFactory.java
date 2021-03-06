public class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle(5);
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle(5);
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square(5);
      }
      
      return null;
   }
}