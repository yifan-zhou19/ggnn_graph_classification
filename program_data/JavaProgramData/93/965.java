package <missing>;

public class GlobalMembers
{
	//********************************************************************
	//??3.5.7????
	//??????
	//???2012.09.28
	//********************************************************************

	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   int x;
	   //cout << "???????" << endl;
	   x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (x % 3 == 0)
	   {
		   a = 3;
	   }
		  else
		  {
			  a = 0;
		  }
	   if (x % 5 == 0)
	   {
		   b = 5;
	   }
		  else
		  {
			  b = 0;
		  }
	   if (x % 7 == 0)
	   {
		   c = 7;
	   }
		  else
		  {
			  c = 0;
		  }
	if (a + b + c == 15)
	{
	   System.out.print("3 5 7");
	}
	if (a + b + c == 0)
	{
	   System.out.print("n");
	}
	if (a + b + c == 8)
	{
	   System.out.print("3 5");
	}
	if (a + b + c == 10)
	{
	   System.out.print("3 7");
	}
	if (a + b + c == 12)
	{
	   System.out.print("5 7");
	}
	if (a + b + c == 3)
	{
	   System.out.print("3");
	}
	if (a + b + c == 5)
	{
	   System.out.print("5");
	}
	if (a + b + c == 7)
	{
	   System.out.print("7");
	}

	return 0;
	}
}

