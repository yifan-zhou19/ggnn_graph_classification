package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 2;
		k = 2;
		for (i = 3;i <= n;i += 2)
		{
			for (j = 1;;j++)
			{
				if (a[j] * a[j] > i)
				{
					break;
				}
				else
				{
					if (i % a[j] == 0)
					{
						break;
					}
				}
			}
			if (a[j] * a[j] > i)
			{
				a[k] = i;
				k++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (a[i] + a[j] == n)
				{
					System.out.print(a[i]);
					System.out.print(' ');
					System.out.print(a[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

