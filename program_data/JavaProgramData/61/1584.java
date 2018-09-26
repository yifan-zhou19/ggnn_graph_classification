package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (int i = 1;i <= n;i++)
	  {
		int a;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a == 1 || a == 2)
		{
		  System.out.print("1\n");
		}
		else
		{
		  int x = 1;
		  int y = 1;
		  int z;
		  for (int m = 3;m <= a;m++)
		  {
			 z = x + y;
			 x = y;
			 y = z;
		  }
		  System.out.printf("%d\n",y);
		}
	  }
	   return 0;
	}
}

