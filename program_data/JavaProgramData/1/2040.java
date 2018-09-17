package <missing>;

public class GlobalMembers
{
	public static int s = 0;
	public static int p = 1;
	public static void fenjie(int a,int b)
	{
		int i;
		if (a == 1)
		{
			s++;
		}
		for (i = b;i <= a;i++)
		{
			if (a % i == 0)
			{
				fenjie(a / i, i);
			}
		}
		return;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 2;j * j <= a[i];j++)
			{
				if (a[i] % j == 0)
				{
					s = 0;
					fenjie(a[i] / j, j);
					p = p + s;
				}
			}
			System.out.printf("%d\n",p);
			p = 1;
		}
		return 0;
	}

}

