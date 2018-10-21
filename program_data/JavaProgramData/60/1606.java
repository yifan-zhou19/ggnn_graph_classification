package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int q;
		int j;
		int[] a = new int[10000];
		int n = 0;
		int k = 0;
	q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (q < 5)
	{
	System.out.print("empty");
	}
		for (i = 2 ; i <= q; i++)
		{
		for (j = 2 ; j < i; j++)
		{
			if (i % j != 0)
			{
		continue;
			}
				else
				{
					break;
				}
		}
			if (j == i)
			{
				a[n++] = i;
			}
		}
	for (i = 0;i < n - 1;i++)
	{
	if ((a[i + 1] - a[i]) == 2)
	{
		k++;
	System.out.print(a[i]);
	System.out.print(" ");
	System.out.print(a[i + 1]);
	System.out.print("\n");
	}
	}

	}
}

