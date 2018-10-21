package <missing>;

public class GlobalMembers
{
	//*********************************
	//*?????                    **
	//*?????? 1200012945       **
	//*???2012.10.23              **
	//*********************************

	public static int Main()
	{
		int[] a = new int[16];
		int x;
		int i;
		int j;
		int k;
		int l;
		int n;
		for (i = 0; ; i++)
		{
			n = 0;
			j = 0;
			while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (x == 0 || x == -1)
				{
					break;
				}
				a[j] = x;
				j++;
			}
			if (x == -1)
			{
				break;
			}
			for (k = 0; k < j; k++)
			{
				for (l = 0; l < j; l++)
				{
					if (a[l] == 2 * a[k])
					{
						n = n + 1;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}

}

