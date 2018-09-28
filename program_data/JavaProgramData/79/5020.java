package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int x = 1;
	int y = 0;
	for (;;)
	{
	x = 1;
	y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (n == 0)
	{
		return 0;
	}
	int[] b = new int[n + 1];
	for (int j = 1;j <= n;j++)
	{
		b[j] = 0;
	}
	for (int i = 1;;i++)
	{
	   if (i == n + 1)
	   {
		   i = 1;
	   }
	   if (b[i] == 1)
	   {
		   continue;
	   }
	   if (x == m)
	   {
		 b[i] = 1;
		 y++;
		 x = 0;
	   }
	   x++;
	   if (y == n)
	   {
		   x = i;
		   break;
	   }
	}
	System.out.printf("%d\n",x);
	}
	}

}

