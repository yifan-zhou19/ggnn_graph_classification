package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int is = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
		  System.out.printf("%d",3);
		  is = 1;
		}
		if (n % 5 == 0)
		{
		  if (is != 0)
		  {
			  System.out.print(" ");
		  }
		  System.out.printf("%d",5);
		  is = 1;
		}
		if (n % 7 == 0)
		{
		  if (is != 0)
		  {
			  System.out.print(" ");
		  }
		  System.out.printf("%d",7);
		  is = 1;
		}
		if (is == 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

