package <missing>;

public class GlobalMembers
{
	public static int p(int m)
	{
		 int i;
		 int[] a = new int[22];
		 a[1] = 1;
		a[2] = 1;
		if (m > 2)
		{
			for (i = 3;i <= m;i++)
			{
				a[i] = a[i - 1] + a[i - 2];
			}
		}
		return a[m];
	}
	public static int Main()
	{
		 int m;
		 int n;
		 int i;
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
			System.out.printf("%d\n",p(m));
		}
		 return 0;
	}
}

