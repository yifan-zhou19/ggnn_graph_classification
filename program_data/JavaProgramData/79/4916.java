package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int j;
		int l;
		int sum;
		for (l = 1;;l++)
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
			if (n == 0 && m == 0)
			{
			break;
			}
			else
			{
				int[] a = new int[300];
				for (i = 0;i < 300;i++)
				{
					if (i <= n)
					{
						a[i] = 1;
					}
					else
					{
						a[i] = 0;
					}
				}
				for (i = 0,k = 0;;i++)
				{
					if (i == n)
					{
						i = 0;
					}
					if (a[i] == 1)
					{
						k++;
					}
					if (k == m)
					{
						a[i] = 0;
						k = 0;
					}
					for (j = 0,sum = 0;j < n;j++)
					{
						sum += a[j];
					}
					if (sum == 1)
					{
						break;
					}
					//else sum=0;
				}
				for (i = 0;i < n;i++)
				{
					if (a[i] == 1)
					{
						System.out.printf("%d\n",i + 1);
					}
				}
			}
		}
		System.in.read();
		System.in.read();
	}

}

