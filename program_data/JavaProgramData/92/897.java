package <missing>;

public class GlobalMembers
{
	public static void sort(int[] p, int n)
	{
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (p[i] < p[j])
				{
					k = p[i];
					p[i] = p[j];
					p[j] = k;
				}
			}
		}
	}
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
		int i;
		int j;
		int k;
		int s;
		int t;
		int sum;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			s = n - 1;
			t = n - 1;
			sum = 0;
			sort(a, n);
			sort(b, n);
			for (i = 0,j = 0,k = 0;k < n;k++)
			{
				if (a[i] > b[j])
				{
					sum = sum + 200;
					i++;
					j++;
				}
				else
				{
					if (a[s] > b[t])
					{
						sum = sum + 200;
						s--;
						t--;
					}
					else
					{
						if (a[s] != b[j])
						{
							sum = sum - 200;
							j++;
							s--;
						}
					}
				}
			}
			System.out.printf("%d\n",sum);
			}
		}
	}








}

