package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 c = 0;
	 while (a != 1)
	 {
	  b = a % 2; //??a????
	  if (b != 0)
	  {
		  c = a * 3 + 1;
		  System.out.print(a);
		  System.out.print("*");
		  System.out.print(3);
		  System.out.print("+");
		  System.out.print(1);
		  System.out.print("=");
		  System.out.print(c);
		  System.out.print("\n");
		  a = c; //??a??????
	  }
	  else
	  {
		  c = a / 2;
		  System.out.print(a);
		  System.out.print("/");
		  System.out.print(2);
		  System.out.print("=");
		  System.out.print(c);
		  System.out.print("\n");
		  a = c; //??a??
	  }
	 }
	 System.out.print("End");
	 System.out.print("\n");
	 return 0;
	}

}

