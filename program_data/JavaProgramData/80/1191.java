package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] y = new int[2];
		int[] m = new int[2];
		int[] d = new int[2];
		int sum = 0;
		int dec = 0;
		int plu = 0;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Lmon = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = y[0]; i < y[1]; i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		for (int j = 1; j < m[0]; j++)
		{
			if ((y[0] % 4 == 0 && y[0] % 100 != 0) || y[0] % 400 == 0)
			{
				dec += Lmon[j];
			}
			else
			{
				dec += mon[j];
			}
		}
		dec += d[0];
		sum -= dec;
		for (int k = 0; k < m[1]; k++)
		{
			if ((y[1] % 4 == 0 && y[1] % 100 != 0) || y[1] % 400 == 0)
			{
				plu += Lmon[k];
			}
			else
			{
				plu += mon[k];
			}
		}
		plu += d[1];
		sum += plu;
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}
}

