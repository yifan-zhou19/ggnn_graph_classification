package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int j;
	int d;
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
			   m = Integer.parseInt(tempVar2);
		   }
		   if (m == 1 || m == 2)
		   {
			   System.out.printf("%d\n",1);
			   continue;
		   }
		   int a = 1;
		   int b = 1;
		   for (j = 3; j <= m; j++)
		   {
			   d = a + b;
			   a = b;
			   b = d;
		   }
		   System.out.printf("%d\n", d);
		}
		return 0;

	}
}

