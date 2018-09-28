package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int n = 0;
		int t = 0;
		int d = 0;
		char c;
		for (i = 0;i < 300;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		n = n + 1;
		if (c != ',')
		{
			i = 300;
		}
		}
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i] == a[j])
					{
						d = d + 1;
						t = t + 1;
					}
					else if (a[i] > a[j])
					{
						t = t + 1;
						d = d;
					}
				}
				if (t == n)
				{
					i = n;
				}
				else
				{
					t = 0;
					d = 0;
				}

			}
			if (d == n)
			{
				System.out.print("No");
			}
			else
			{
				t = 0;
				for (i = 0;i < n;i++)
				{
				for (j = 0;j < n;j++)
				{
					if (a[i] >= a[j])
					{
					t = t + 1;
					}
				}
				if (t == n - d)
				{
					System.out.printf("%d",a[i]);
					break;
				}
				t = 0;
				}
			}
		}
		return 0;
	}



}

