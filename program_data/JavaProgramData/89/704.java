package <missing>;

public class GlobalMembers
{
	// ?????? ?? 1000062708
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i]--;
			a[j]++;
		}while (i != 0 || j != 0);
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

