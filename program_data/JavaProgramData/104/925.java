package <missing>;

public class GlobalMembers
{
	public static int search(int x1,int x2)
	{
		int i;
		for (i = 0;i <= 10;i++)
		{
		   if (x1 >= Math.pow(2,i) && x1 < Math.pow(2,i + 1) && x2 >= Math.pow(2,i) && x2 < Math.pow(2,i + 1))
		   {
			   return x1;
		   }
		   else
		   {
			   continue;
		   }
		}
		  x1 = x1 / 2;
		  return search(x1, x2);


	}
	public static int equal(int x1,int x2)
	{
	   if (x1 == x2)
	   {
		   return x1;
	   }
	   else
	   {
		   x1 = x1 / 2;
		   x2 = x2 / 2;
		   return equal(x1, x2);
	   }

	}

	public static int Main()
	{
	  int x1;
	  int x2;
	  int temp;
	  x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (x1 < x2)
	  {
		  temp = x1;
		  x1 = x2;
		  x2 = temp;

	  }
	  x1 = search(x1, x2);
	  System.out.print(equal(x1, x2));
	  return 0;


	}
}

