package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] day = new int[13];
		int w;
		int i;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		w = (w + 12) % 7;
		day[1] = w;
		if (w == 5)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		for (i = 2;i <= 12;i++)
		{
			day[i] = (day[i - 1] + a[i - 1]) % 7;
			if (day[i] == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

