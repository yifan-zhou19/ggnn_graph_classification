package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double e;
		char[][] zf = new char[2][501];
		char count = 0;
		char c;
		char w = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		zf[0] = new Scanner(System.in).nextLine();
		zf[1] = new Scanner(System.in).nextLine();
		int a = String.valueOf(zf[0]).length();
		int b = String.valueOf(zf[1]).length();
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			for (int m = 0;m < a;m++)
			{
				for (int o = 0;o < 2;o++)
				{
					if (zf[o][m] != 'A' && zf[o][m] != 'T' && zf[o][m] != 'G' && zf[o][m] != 'C')
					{
						w++;
					}
				}
			}
			if (w != 0)
			{
				System.out.print("error");
			}
			else
			{
			for (int i = 0;i < a;i++)
			{
				if (zf[0][i] == zf[1][i])
				{
					count++;
				}
			}
			if (1.0 * count / a > e)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
			}
		}

		return 0;
	}
}

