package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y; //y,m,d??????a???????b?y?1?1??????
		int m;
		int d;
		int b;
		int a;
		int c = 0;
		int n;
		int i;
		int k;
		int sum = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ((y - 1) - (y - 1) % 4) / 4 * 2 + ((y - 1) - ((y - 1) - (y - 1) % 4) / 4) * 1;
		for (i = 1;i <= (y - y % 100) / 100;i++)
		{
			if (i % 4 != 0)
			{
				sum = sum + 1;
			}
			else
			{
				sum = sum;
			}
		}
		b = (a - sum) % 7 + 1;
		if (y % 4 != 0 || y % 100 == 0 && y % 400 != 0)
		{
			str[1] = 28;
		}
		else
		{
			str[1] = 29;
		}
		if (m > 1)
		{
			for (i = 0;i < m - 1;i++)
			{
				c = c + str[i];
			}
		}
		else
		{
			c = 0;
		}
		n = (c + d) % 7 - 1;
		k = (b + n) % 7;
		if (k == 1)
		{
			System.out.print("Mon.");
			System.out.print("\n");
		}
		else if (k == 2)
		{
			System.out.print("Tue.");
			System.out.print("\n");
		}
		else if (k == 3)
		{
			System.out.print("Wed.");
			System.out.print("\n");
		}
		else if (k == 4)
		{
			System.out.print("Thu.");
			System.out.print("\n");
		}
		else if (k == 5)
		{
			System.out.print("Fri.");
			System.out.print("\n");
		}
		else if (k == 6)
		{
			System.out.print("Sat.");
			System.out.print("\n");
		}
		else if (k == 0)
		{
			System.out.print("Sun.");
			System.out.print("\n");
		}
		return 0;
	}


}

