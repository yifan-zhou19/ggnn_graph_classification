package <missing>;

public class GlobalMembers
{
	/*         1134 ??
	??????      2010.11.03     */
	public static int Main()
	{
		int i;
		int j;
		int l;
		int k;
		int s;
		int t;
		int[] a = new int[100000]; //b?????????
		int[] b = new int[100000];
		for (i = 0; i < 100000; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == -1)
			{
				break;
			}
		}
		s = 0; //s????????????
		for (i = 0; i < 100000; i++)
		{
			t = 0; //t????????????
			for (j = 0; j < 10000; j++)
			{
				b[j] = a[s];
				s++;
				if (b[j] == 0)
				{
					for (k = 0; k <= j; k++)
					{
						for (l = k + 1; l <= j; l++)
						{
							if ((b[k] == 2 * b[l]) || (b[l] == 2 * b[k]))
							{
								t++;
							}
						}
					}
					System.out.print(t);
					System.out.print("\n");
					break;
				}
			}
			if (a[s] == -1)
			{
				break;
			}
		}
		return 0;
	}

}

