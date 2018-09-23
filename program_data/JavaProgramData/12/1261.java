package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int m;
		int n;
		for (i = 0;i < 100000;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == -1)
			{
			break;
			}
			if (a[i] == 0)
			{
				n = 0;
				for (j = 0;j < i;j++)
				{
					for (k = 0;k < i;k++)
					{
						if (a[k] == 0)
						{
						continue;
						}
						if (a[j] == 2 * a[k])
						{
						n = n + 1;
						}
					}
				}
				System.out.print(n);
				System.out.print("\n");
				a[0] = 0;
				i = 0;
			}
		}
		return 0;
	}

}

