package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j < n;j++)

		{
				b[j] = a[n - j];
				System.out.print(b[j]);
				System.out.print(" ");
		}
			 for (j = n;j <= n;j++)
			 {
						  b[j] = a[n - j];
						 System.out.print(b[j]);
			 }
		return 0;
	}
}

