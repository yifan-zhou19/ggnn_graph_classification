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
		int h;
		int[] a = new int[301];
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 || m == 0)
			{
				break;
			}
			else
			{
				for (j = 1;j <= n;j++)
				{
				a[j] = 1;
				}
				k = 0;
				t = n;
				for (j = 1;;j++)
				{
					if (j % n == 0)
					{
						h = n;
					}
					else
					{
						h = j % n;
					}
					if (a[h] != 0)
					{
						k++;
					}
					if (k == m)
					{
						a[h] = 0;
						k = 0;
						t--;
					}
					if (t == 0)
					{
						System.out.printf("%d\n",h);
						break;
					}
				}
			}
		}
	}
}

