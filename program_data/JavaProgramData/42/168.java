package <missing>;

public class GlobalMembers
{
	/*????????????
	**?  ????
	**?  ??2010?10?29?
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int count = 0;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n - count; i++)
		{
			if (a[i] == k)
			{
				count++; //?a[i]????,???+1
				for (j = i + 1; j <= n; j++) //??a[i]?????????
				{
					if (a[j] == k)
					{
						count++; //???????,??+1
					}
					else
					{
						for (m = i; m <= n - (j - i); m++)
						{
							a[m] = a[m + j - i]; //?????????????,??????
						}
						break; //???a[j]???
					}
				}
			}
		}
		for (i = 1; i <= n - count; i++)
		{
			if (i < n - count)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			if (i == n - count)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

