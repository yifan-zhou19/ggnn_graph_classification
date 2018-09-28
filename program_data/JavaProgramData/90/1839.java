package <missing>;

public class GlobalMembers
{
	public static int fun(int m, int n, int j)
	{
		int i;
		int s = 0;
		if (m < j)
		{
		   return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		for (i = j;i < m;i++)
		{
			s += fun(m - i, n - 1, i);
		}
		return s;
	}
	public static void Main()
	{
	   int n;
	   int m;
	   int s;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   i = Integer.parseInt(tempVar);
	   }
	   while (i-- != 0)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 n = Integer.parseInt(tempVar3);
		 }
		 if (n > m)
		 {
			 n = m;
		 }
		 s = fun(m, n, 0);
		 System.out.printf("%d\n",s);
	   }
	}
}

