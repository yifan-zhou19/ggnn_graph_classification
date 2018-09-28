package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[300];
		int[] m = new int[300];
		int t = 0;
		int i;
		int j;
		int k;
		int p;
		int[] a = new int[300];
		for (i = 0;;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n[i] == 0)
			{
				break;
			}
			else
			{
			t++;
			}
		}
		for (p = 0;p < t;p++)
		{
			for (i = 0;i < n[p];i++)
			{
				a[i] = i + 1;
			}
			i = 0;
			j = 0;
			k = 0;
			while (j < n[p])
			{
				if (a[i] != 0)
				{
					k++;
					if (k % m[p] == 0)
					{
						j++;
						if (j == n[p])
						{
							System.out.print(a[i]);
							System.out.print("\n");
							break;
						}
						a[i] = 0;
					}
				}
				i++;
				if (i == n[p])
				{
					i = 0;
				}
			}
		}
		return 0;
	}


}

