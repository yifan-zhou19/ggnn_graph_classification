package <missing>;

public class GlobalMembers
{
	public static void joseph(int n,int m)
	{
		int i;
		int[] a = new int[301];
		int k = 0;
		int num = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = 1;
		}
		i = 1;
		while (num < n - 1)
		{
			if (a[i] == 1)
			{
				k++;
				if (k == m)
				{
					a[i] = 0;
					num++;
					k = 0;
				}
			}
			if (i == n)
			{
				i = 1;
			}
			else
			{
				i++;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf("%d\n",i);
			}
		}
	}
	public static void Main()
	{
		int[] n = new int[20];
		int[] m = new int[20];
		int i;
		int num;
		for (i = 0;i < 20;i++)
		{
			n[i] = 1;
			m[i] = 1;
		}
		i = -1;
		while (m[i] != 0 && n[i] != 0)
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}

		}
		num = i;
		for (i = 0;i < num;i++)
		{
			joseph(n[i], m[i]);
		}

	}

}

