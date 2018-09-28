package <missing>;

public class GlobalMembers
{
	public static void f1(int[] a, int e)
	{
		int i;
		for (i = 0;i < e;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void f2(int[] b, int f)
	{
		int k;
		int t;
		int g;
		for (k = 0;k < f - 1;k++)
		{
			for (t = 0;t < f - 1;t++)
			{
				if (b[t] > b[t + 1])
				{
					g = b[t];
					b[t] = b[t + 1];
					b[t + 1] = g;
				}
			}
		}
	}
	public static void f3(int[] c, int h, int[] d, int l)
	{
		int z;
		for (z = 0;z < h;z++)
		{
			System.out.printf("%d ",c[z]);
		}
		for (z = 0;z < l - 1;z++)
		{
			System.out.printf("%d ",d[z]);
		}
		System.out.printf("%d",d[l - 1]);
	}
	public static void Main()
	{
		int[] shuzu1 = new int[200];
		int[] shuzu2 = new int[200];
		int geshu1;
		int geshu2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			geshu1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			geshu2 = Integer.parseInt(tempVar2);
		}
		f1(shuzu1, geshu1);
		f1(shuzu2, geshu2);
		f2(shuzu1, geshu1);
		f2(shuzu2, geshu2);
		f3(shuzu1, geshu1, shuzu2, geshu2);
	}
}

