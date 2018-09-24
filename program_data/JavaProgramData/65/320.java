package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		if (x == y)
		{
		return 0;
		}
		else if ((x == 0 && y == 1) || (x == 1 && y == 2) || (x == 2 && y == 0))
		{
		return 1;
		}
		else
		{
		return -1;
		}
	}

	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int b;
	   int flag = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   b = Integer.parseInt(tempVar3);
			   }
			   flag = flag + f(a, b);
	   }
	   if (flag > 0)
	   {
	   System.out.print("A\n");
	   }
	   else if (flag == 0)
	   {
	   System.out.print("Tie\n");
	   }
	   else
	   {
	   System.out.print("B\n");
	   }

	}

}

