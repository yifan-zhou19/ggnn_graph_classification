package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 1000;
		for (int h = 0;h <= N;h++)
		{
		int[] a = new int[300];
		int i;
		int j;
		int t;
		for (i = 0;i < 300;i++)
		{
			a[i] = 0;
		}
		int n;
		int m;
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
		i = 0;
		t = 1;
		j = n;
		for (n;n > 1;)
		{
			if (i < j)
			{
				if (a[i] == 0)
				{
					if (t == m)
					{
						a[i] = 1;
						t = 1;
						n--;
					}
					else
					{
						t++;
						i++;
					}
				}
				else
				{
					i++;
				}
			}
			else
			{
				i = 0;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (a[i] == 0)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	if (n == 0 && m == 0)
	{
	break;
	}
		}
	}

}

