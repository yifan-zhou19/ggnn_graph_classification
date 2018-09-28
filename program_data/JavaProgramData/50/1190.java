package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[12];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = 12 + n;
		if (b[0] % 7 == 5)
		{
			System.out.print("1");
			System.out.print('\n');
		}
		for (i = 1;i <= 11;i++)
		{
			b[i] = b[i - 1] + a[i - 1];
			if (b[i] % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print('\n');
			}
		}
		return 0;
	}


}

