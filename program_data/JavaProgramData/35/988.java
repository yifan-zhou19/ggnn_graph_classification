package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[][] sz = new int[9][9];
		int i;
		int j;
		int e;
		int f;
		String ss = new String(new char[10]);
		String aa = new String(new char[10]);
		String bb = new String(new char[10]);
		ss = ConsoleInput.readToWhiteSpace(true).charAt(0);
		aa = tangible.StringFunctions.changeCharacter(aa, 0, ss.charAt(0));
		bb = tangible.StringFunctions.changeCharacter(bb, 0, ss.charAt(2));
		i = Integer.parseInt(aa);
		j = Integer.parseInt(bb);

		for (e = 0;e < i;e++)
		{
			for (f = 0;f < j;f++)
			{
				sz[e][f] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int a;
		int b;
		int c;
		int d;
		int[] max = new int[100];
		for (a = 0;a < i;a++)
		{
			for (b = 0;b < j;b++)
			{
			if (sz[a][max[a]] < sz[a][b])
			{
				max[a] = b;

			}
			}
		}
		int tem = 0;
			int x;

		for (c = 0;c < i;c++)
		{
			x = 0;

			if (tem == 1)
			{
				break;
			}
			for (d = 0;d < i;d++)
			{


			if (sz[c][max[c]] > sz[d][max[c]])
			{
				x = 1;
			}

			}
			if (tem == 0 && x == 0 && c != d)
			{
				System.out.print(c);
				System.out.print("+");
				System.out.print(max[c]);
				tem++;
			}




		}
		if (tem == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

