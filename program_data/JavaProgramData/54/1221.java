package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1001];
		for (int t = 1;1;t++)
		{
			a[n] = t * (n - 1);
			for (i = n - 1;i >= 0;i--)
			{
				if (a[i + 1] % (n - 1) == 0)
				{
					a[i] = n * a[i + 1] / (n - 1) + k;
				}
				else
				{
					break;
				}
			}
					  if (i == -1)
					  {
						  break;
					  }
		}
		System.out.print(a[0]);
		System.out.print("\n");
		return 0;
	}
}

