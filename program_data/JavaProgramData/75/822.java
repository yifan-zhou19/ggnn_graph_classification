package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int figure;
		int figuremax;
		int time;
		int n;
		int[] start = new int[1001];
		int[] end = new int[1001];
		char sign;
		do
		{
			i++;
			start[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(sign);
			if (sign == '\n')
			{
				break;
			}
		}while (1 != 0);
		n = i;
		for (i = 1;i <= n;i++)
		{
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(sign);
		}
		System.out.print(n);
		System.out.print(' ');
		figuremax = 0;
		for (time = 0;time <= 1000;time++)
		{
			figure = 0;
			for (i = 1;i <= n;i++)
			{
				if (time >= start[i] != 0 && time < end[i])
				{
					figure++;
				}
			}
			if (figure > figuremax)
			{
				figuremax = figure;
			}
		}
		System.out.print(figuremax);

		return 0;
	}
}

