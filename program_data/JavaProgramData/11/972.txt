package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int z;
		int k = 0;
		int i;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))
		{
			for (i = 0;i < y - 1;i++)
			{
				k = k + b[i];
			}
		}
		else
		{
			for (i = 0;i < y - 1;i++)
			{
				k = k + a[i];
			}
		}
		k = k + z;
		System.out.print(k);
		return 0;
	}
}

