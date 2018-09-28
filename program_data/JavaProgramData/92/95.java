package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int i0;
		int j0;
		int sum = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			sum = 0;
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(a,a + n);
			sort(b,b + n);
			for (i = j = n - 1, i0 = j0 = 0;j >= j0 != 0 && i >= i0;j--)
			{
				if (a[i] > b[j])
				{
					sum++;
					i--;
				}
				else if (a[i] < b[j])
				{
					sum--;
					i0++;
				}
				else
				{
					if (a[i0] > b[j0])
					{
						sum++;
						i0++;
						j0++;
						j++;
					}
					else if (a[i0] < b[j0])
					{
						sum--;
						i0++;
					}
					else
					{
						if (a[i0] == b[j])
						{
							i0++;
						}
						else
						{
							sum--;
							i0++;
						}
					}
				}
			}
			System.out.print(200 * sum);
			System.out.print("\n");
		}
		return 0;
	}
}

