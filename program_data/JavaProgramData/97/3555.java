package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int[] a = new int[6];
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = p / 100;
		a[1] = (p - a[0] * 100) / 50;
		a[2] = (p - a[0] * 100 - a[1] * 50) / 20;
		a[3] = (p - a[0] * 100 - a[1] * 50 - a[2] * 20) / 10;
		a[4] = (p - a[0] * 100 - a[1] * 50 - a[2] * 20 - a[3] * 10) / 5;
		a[5] = p - a[0] * 100 - a[1] * 50 - a[2] * 20 - a[3] * 10 - a[4] * 5;
		for (int i = 0;i < 6;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

