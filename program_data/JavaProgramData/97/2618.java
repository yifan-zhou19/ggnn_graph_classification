package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		int n;
		int i;
		n,i = ConsoleInput.readToWhiteSpace(true);
		b[0] = n / 100;
		for (i = 1;i <= 5;i++)
		{
			n = n - b[i - 1] * a[i - 1];
			b[i] = n / a[i];
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

