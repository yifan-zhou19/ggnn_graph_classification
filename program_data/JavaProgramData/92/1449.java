package <missing>;

public class GlobalMembers
{
	public static void sort(int[] a, int n) //????????
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n;i++)
		{
			k = i;
			for (j = i;j < n;j++)
			{
				if (a[j] > a[k])
				{
					k = j;
				}
			}
			if (i != k)
			{
					t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int s;
		int[] t = new int[MAX];
		int[] q = new int[MAX];
		while (true)
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
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			sort(t, n);
			sort(q, n);
			s = 0;
			for (k = 0,i = 0,j = 0,l = n - 1;k < n;k++)
			{
					if (t[i] > q[j])
					{
							i++;
						j++;
						s++;
					}
					else if (t[l - j + i] > q[l])
					{
							l--;
						s++;
					}
					else if (t[l - j + i] < q[l])
					{
							j++;
						s--;
					}
						else if (t[l - j + i] < q[j])
						{
								j++;
							s--;
						}
							else
							{
							j++;
							}

			}
			System.out.printf("%d\n",s * 200);





		}
	}

}

