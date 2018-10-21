package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int[] md1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] md2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int jl = 0;
		int i;
		int j;
		int k;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				jl += 366;
			}
			else
			{
				jl += 365;
			}
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			for (i = 0;i < m1 - 1;i++)
			{
				jl -= md2[i];
			}
			jl -= d1;
		}
		else
		{
			for (i = 0;i < m1 - 1;i++)
			{
				jl -= md1[i];
			}
			jl -= d1;
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			for (i = 0;i < m2 - 1;i++)
			{
				jl += md2[i];
			}
			jl += d2;
		}
		else
		{
			for (i = 0;i < m2 - 1;i++)
			{
				jl += md1[i];
			}
			jl += d2;
		}
		System.out.print(jl);
		System.out.print("\n");
		return 0;
	}
}

