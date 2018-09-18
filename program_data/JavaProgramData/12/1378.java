package <missing>;

public class GlobalMembers
{
	//********************************
	//*??? ??     **
	//*?????? 1300012887 **
	//*???2013.10.23 **
	//********************************
	public static int Main()
	{
		int i = 0;
		int x;
		int j;
		int g;
		int k;
		int b;
		int[] a = new int[15];
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (x == -1)
			{
				return 0;
			}
			else
			{
				j = 0;
				i = 0;
				for (g = 0; ; g++)
				{
					a[i] = x;
					i++;
					x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (x == 0)
					{
						break;
					}
				}
				for (k = 0;k < i;k++)
				{
					b = 2 * a[k];
					for (g = 0; g < i; g++)
					{
						if (a[g] == b)
						{
							j++;
						}
					}
				}
			}
			System.out.print(j);
			System.out.print("\n");
		}
	}











}

