package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x; //???????b[i]??????
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 6;i++)
		{
			b[i] = (x - x % a[i]) / a[i];
			x = x - a[i] * b[i];
			System.out.print(b[i]);
			System.out.print("\n");
		}

			return 0;
	}

}

