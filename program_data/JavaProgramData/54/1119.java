package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int n,int k);
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",f(n, k));
		return 0;
	}
	public static int f(int n,int k)
	{
		double s;
		double x;
		int i;
		int j;
		int m;
		for (j = 1;;j++)
		{
				 s = n * j + k;
				 for (i = 2;i <= n;i++)
				 {
					 s = n * (s / (n - 1)) + k;
					 m = (int)s;
					 x = s - m;
					 if (x != 0)
					 {
						break;
					 }
				 }
				 m = (int)s;
				 x = s - m;
				 if (x == 0)
				 {
						break;
				 }
		}
		return s;
	}


}

