package <missing>;

public class GlobalMembers
{
	public static int zhengchang(int i,int j)
	{
		if ((i >= 90 && i <= 140) && (j >= 60 && j <= 90))
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int k;
		int[] t = new int[100];
		int m = 0;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[k] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (zhengchang(a[i], b[i]) != 0)
			{
				for (j = i;zhengchang(a[j], b[j]) != 0;j++)
				{
					t[m]++;
				}
				i = j - 1;
				m++;
			}
		}
		max = t[0];
		for (i = 1;i < m;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
			}
		}
		System.out.printf("%d",max);
		return 0;
	}
}

