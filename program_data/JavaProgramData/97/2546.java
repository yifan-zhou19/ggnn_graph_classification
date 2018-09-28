package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 100, 50, 20, 10, 5, 1};
		int[] b = new int[7];
		int q;
		int i;
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 6;i++)
		{
			if (q >= a[i])
			{
				b[i] = q / a[i];
				q = q % a[i];
			}
		}
		for (i = 1;i <= 6;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

