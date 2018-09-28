package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
			return ((int)a - (int)b);
	}

	public static int Main()
	{
			int n;
			int k;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] a = new int[1000];
			for (int i = 0; i < n ; i++)
			{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
			for (int i = 0 ; i < n ; i++)
			{
					for (int j = n - 1 ; j > i ; j--)
					{
							if (a[i] + a[j] == k)
							{
									System.out.print("yes");
									System.out.print("\n");
									return 1;
							}
							else if (a[i] + a[j] < k)
							{
									break;
							}
					}
			}
			System.out.print("no");
			System.out.print("\n");
			return 0;
	}
}

