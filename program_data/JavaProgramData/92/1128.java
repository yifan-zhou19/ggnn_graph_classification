package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000]; //a????b???
		int[] b = new int[1000];
		int circle;
		int i;
		int j;
		int i1;
		int i2;
		int j1;
		int j2;
		int count;
		int win;
		int t;
		for (circle = 0;;circle++)
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
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (b[j] < b[j + 1])
					{
						t = b[j];
						b[j] = b[j + 1];
						b[j + 1] = t;
					}
				}
			}
			win = 0;
			count = 0;
			i1 = 0;
			i2 = n - 1;
			j1 = 0;
			j2 = n - 1;
			while (count < n)
			{
				for (;i1 <= n - 1 - (n - 1 - i2);i1++,j1++)
				{
					if (a[i1] > b[j1])
					{
						win++;
						count++;
					}
					else
					{
						j1++;
						break;
					}
				} //??
				if (count == n)
				{
					break;
				}
				for (;j2 >= 0;i2--,j2--)
				{
					if (a[i2] > b[j2])
					{
						win++;
						count++;
					}
					else
					{
						i2--;
						break;
					}
				} //??
				if (count == n)
				{
					break;
				}
				if (a[i2 + 1] < b[j1 - 1])
				{
					win--; //?a[t2]?b[t1]?
				}
				count++;
			}
			System.out.printf("%d\n",win * 200);
		}
		return 0;
	}
}

