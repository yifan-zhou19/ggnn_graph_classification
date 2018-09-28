package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10000];
		int m = 1;
		int i;
		int j;
		int t;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			t = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					t++;
					break;
				}
				else
				{
					continue;
				}
			}
			if (t == 0)
			{
				a[m] = i;
				m++;
			}
			else
			{
				continue;
			}
		}
		for (i = 1;i < m;i++)
		{
			if (a[i] == a[i + 1] - 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				k++;
			}
			else
			{
				continue;
			}
		}
		if (k == 1)
		{
			System.out.print("empty\n");
		}
	}

}

