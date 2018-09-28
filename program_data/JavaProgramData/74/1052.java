package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int s = 0;
		int r = 0;
		int w = 0;
		int p = 0;
		int flag;
		int sum;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
			for (i = m;i < n + 1;i++)
			{
			t = i;
			sum = 0;
			while (t != 0)
			{
				j = t % 10;
			sum = sum * 10 + j;
			t = t / 10;
			}
			if (sum == i)
			{
				a[w++] = sum;
			}
			}
			for (k = 0;k < w;k++)
			{
				flag = 0;
				for (i = 2;i < a[k];i++)
				{
					if (a[k] % i == 0)
					{
					flag = 1;
					a[k] = 0;
					break;
					}
				}
				if (flag == 0)
				{
					s++;
				}
			}
			for (i = 0;i < w;i++)
			{
					if (a[i] != 0)
					{
						b[p++] = a[i];
					}
			}
					if (p != 0)
					{
			for (i = 0;i < p - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}

			System.out.printf("%d",b[p - 1]);
					}
					else
					{
						System.out.print("no");
					}

	}


}

