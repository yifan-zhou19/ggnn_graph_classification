package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n;)
		{
			if (a[i] == k)
			{
				for (int j = i; j < n - 1; j++)
				{
					a[j] = a[j + 1];
				}
				n--;
			}
			else
			{
				i++;
			}
		}
		System.out.print(a[0]);
		for (int i = 1; i < n; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

