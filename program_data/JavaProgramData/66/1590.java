package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int w;
		int i;
		int j = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String[] a = {"Sun.", "Mon.", "Tue.", "Wed.", "Tue.", "Fri.", "Sat."};
		w = y % 7 + y / 4 - y / 100 + y / 400;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			if (w == 1)
			{
				w = 7;
			}
			else
			{
			w = w - 1;
			}
			day[2] = 29;
		}
		for (i = 1;i < m;i++)
		{
			j = j + day[i];
		}
		j = j + d - 1;
		w = (j + w) % 7;
		System.out.print(a[w]);
		System.out.print("\n");
	}






}

