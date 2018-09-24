package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int[] n = new int[13];
		int i;
		int sum = 0;
		n[1] = n[3] = n[5] = n[7] = n[8] = n[10] = n[12] = 31;
		n[0] = n[2] = 0; //?????
		n[4] = n[6] = n[9] = n[11] = 30;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0)) //???????29????28??
		{
			n[2] = 29;
		}
		else
		{
			n[2] = 28;
		}
		for (i = 1;i < m;i++) //?????
		{
			sum = sum + n[i];
		}
		sum = sum + d;
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

