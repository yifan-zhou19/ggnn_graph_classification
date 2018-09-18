package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int m;
		int n;
		int t;
		while (a[0] != -1)
		{
			t = 0;
			n = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] <= 0)
				{
					break;
				}
				else
				{
					t++;
				}
			}
			if (a[0] == -1)
			{
				break;
			}
			else
			{
			for (j = 0;j < t;j++)
			{
				for (m = 0;m < t;m++)
				{
					if (a[j] == 2 * a[m])
					{
						n++;
					}
				}
			}
				System.out.printf("%d\n",n);
			}
		}
		return 0;
	}

}

