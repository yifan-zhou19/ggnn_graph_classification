package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int[] b = new int[10];
		int i;
		int j;
		int n;
		a[0] = 1;
		a[1] = 1;
		for (i = 2;i <= 19;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = a[j - 1];
			System.out.print(b[i]);
			System.out.print("\n");
		}



		return 0;
	} // ?????


}

