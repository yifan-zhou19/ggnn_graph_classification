package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int cho = new int(int m,int n);
		n[0] = 1;
		m[0] = 1;
		for (i = 1;n[i - 1] != 0 && m[i - 1] != 0;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;n[i] != 0 && m[i] != 0;i++)
		{
			System.out.printf("%d\n",cho(m[i], n[i]));
		}
	}
	public static int cho(int m,int n)
	{
		int t = 1;
		int i;
		int j;
		int k;
		int s;
		int temp = 1;
		int[] a = new int[301];
		for (i = 0;i < 301;i++)
		{
			a[i] = 1;
		}
		if (n != 1)
		{
			for (k = 1;s != 1;k++)
			{
			for (i = 1,t = temp;i <= m;)
			{
				if (t > n)
				{
					t = 1;
				}
				if (a[t] == 1)
				{
					i++;
				}
				t++;
			}
			a[t - 1] = 0;
			temp = t;
		for (j = 1,s = 0;j <= n;j++)
		{
			if (a[j] == 1)
			{
				s++;
			}
		}
			}
		for (j = 1;j <= n;j++)
		{
			if (a[j] == 1)
			{
				return (j);
			}
		}
		}
		else
		{
			j = 1;
		}
		return (j);
	}

}

