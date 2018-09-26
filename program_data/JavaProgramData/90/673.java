package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int Main()
	{
		int i;
		int j;
		int k;
		int way = new int(int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 0;i < j;i++)
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
		 k = way(m, n);
		 System.out.printf("%d\n",k);
		}
	}
	public static int way(int m,int n)
	{
		int z;
		if (n == 1 || m == 1 || m == 0)
		{
			z = 1;
		}
		else
		{
		 if (m < n)
		 {
			 z = way(m, m);
		 }
		 else
		 {
			 z = way(m, n - 1) + way(m - n, n);
		 }
		}
		return (z);
	}

}

