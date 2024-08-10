
public class OperatorP1 
{
  void arithmeticOperators()
  {
	  int a=100,b=200;
	  System.out.println("Add::"+(a+b));
	  System.out.println("Sub::"+(a-b));
	  System.out.println("Mul::"+(a*b));
	  System.out.println("Mod::"+(a%b));
	  System.out.println("Div::"+(a/b));
  }
  void relationOperator()
  {
	  int a=100,b=200;
	  System.out.println("Lessthan::"+(a<b));
	  System.out.println("Greaterthan::"+(a>b));
	  System.out.println("Equal to:::"+(a==b));
	  System.out.println("NotEqual::"+(a!=b));
  }
  void logicalOperator()
  {
	  int a=10,b=20;
	  System.out.println("LogicalAND::"+((a>b)&&(b<a)));
	  System.out.println("LogicalOR::"+((a<b)||(b>a)));
	  System.out.println("LogicalNOT::"+(!(a>b)));
  }
  void bitwiseOperator()
  {
	  int a=2,b=3;
	  System.out.println("BitWiseAND::"+(a&b));
	  System.out.println("BitWiseOR::"+(a|b));
	  System.out.println("BitWiseXOR::"+(a^b));
	  System.out.println("OneComplement::"+(~a));
	  System.out.println("Leftshift::"+(a<<1));
	  System.out.println("RightShift::"+(a>>1));
  }
	public static void main(String[] args) {
		
		OperatorP1 f1=new OperatorP1();
		//f1.arithmeticOperators();
		f1.relationOperator();

	}

}
