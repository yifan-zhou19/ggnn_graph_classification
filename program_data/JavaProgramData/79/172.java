package <missing>;

public class GlobalMembers
{
	public static void ysf(int n,int m)
	{
		int i;
		int j;
		int[] b = new int[300];
		int num;
		int p;
		num = 0;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 1;j <= m;j++)
			{
				num = num + 1;
				if (num > n)
				{
						num = num - n;
				}
				while (b[num] == 1)
				{
					num = num + 1;
					if (num > n)
					{
						num = num - n;
					}
				}
			}
			b[num] = 1;
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] == 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int[] n = new int[100];
		int[] m = new int[100];
		for (i = 0;;i++)
		{
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
			if (m[i] == 0)
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			ysf(n[j], m[j]);
		}
	}

}

