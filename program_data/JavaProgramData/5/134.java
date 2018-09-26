package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}
		char[][] DNA = new char[2][501];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			DNA[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			DNA[1] = tempVar3.charAt(0);
		}
		int t;
		int i;
		int j;
		int number = 0;
		t = String.valueOf(DNA[0]).length();
		int w;
		w = String.valueOf(DNA[1]).length();
		if (t != w)
		{
			System.out.print("error");

			return 0;
		}
		for (i = 0;i < t;i++)
		{
			if (DNA[0][i] != 'A' && DNA[0][i] != 'T' && DNA[0][i] != 'C' && DNA[0][i] != 'G')
			{
				System.out.print("error");

				return 0;
			}
			if (DNA[1][i] != 'A' && DNA[1][i] != 'T' && DNA[1][i] != 'C' && DNA[1][i] != 'G')
			{
				System.out.print("error");

				return 0;
			}
			if (DNA[0][i] == DNA[1][i])
			{
				number++;
			}

		}
		double r;
		r = 1.00 * number / t;
		if (r >= rate)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}



		return 0;

	}
}

