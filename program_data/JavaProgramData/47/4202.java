package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j;
		for (j = n - 1;j >= 0;j--)
		{
			System.out.print(a[j]);
			if (j != 0)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}



}

