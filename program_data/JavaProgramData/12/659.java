package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???   ??                           **
	//*??????       **
	//*???2011.10.21                         **
	//****************************************
	public static int Main()
	{
		int[] a = new int[20]; //k????
		int k = 0;
		int i;
		int w;
		int y;
		int n;
		int p;
		while (true)
		{
				p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (p == -1) //????-1,?????
				{
						break;
				}
				else
				{
					a[0] = p;
					for (i = 1; ;i++)
					{
							a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							if (a[i] == 0)
							{
										n = i - 1;
										break;
							}
					}
					for (w = 0;w <= n;w++)
					{
					for (y = 0;y <= n;y++)
					{
							 if (a[y] == 2 * a[w])
							 {
							 k++;
							 }
					}
					}
					System.out.print(k);
					System.out.print("\n");
					i = 0;
					k = 0;
				}
		}
		return 0;
	}

}

