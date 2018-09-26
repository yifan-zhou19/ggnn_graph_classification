package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int[] a = new int[301];
	public static int[] b = new int[1000];
	public static void P(int m,int n)
	{
		int i;
		int k;
		int j;
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		k = 0;
		i = 1;
		j = 0;
		while (k < n - 1)
		{
			if (a[i] != 0)
			{
				j++;
			}
			if (j == m)
			{
				a[i] = 0;
				j = 0;
				k++;
			}
			i++;
			if (i == n + 1)
			{
				i = 1;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] != 0)
			{
				b[num] = i;
			}
		}
	}

	public static void Main()
	{
		int i;
		int m;
		int n;
		for (num = 0;;num++)
		{
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
			if (m == 0 && n == 0)
			{
				break;
			}
			else
			{
				P(m, n);
			}
		}
		for (i = 0;i < num;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}
}

