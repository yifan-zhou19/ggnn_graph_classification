package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[10000]);
		String out = new String(new char[10000]);
		String p = in;
		String q = out;
		int[] x = new int[1000];
		int[] y = new int[1000];
		int[] temp1 = new int[5];
		int[] temp2 = new int[5];
		int[] r = temp1;
		int[] s = temp2;
		int i = 0;
		int j;
		int count = 0;
		int max = 0;
		int period;
		for (i = 0;i < 1000;i++)
		{
			x[i] = y[i] = 0;
		}
		i = 0;
		in = ConsoleInput.readToWhiteSpace(true).charAt(0);
		out = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (p != 0)
		{
			if (p == ',')
			{
				p = p.Substring(1);
			}
			else
			{
				while (p != ',' && p != 0)
				{
					r[0] = p - '0';
					p = p.Substring(1);
					r++;
				}
				j = 0;
				while (r > temp1)
				{
					r--;
					x[i] = x[i] + r * Math.pow((double)10,j);
					j++;
					r[0] = 0;
				}
				i++;
			}
		}
		i = 0;
		while (q != 0)
		{
			if (q == ',')
			{
				q = q.Substring(1);
			}
			else
			{
				while (q != ',' && q != 0)
				{
					s[0] = q - '0';
					q = q.Substring(1);
					s++;
				}
				j = 0;
				while (s > temp2)
				{
					s--;
					y[i] = y[i] + s * Math.pow((double)10,j);
					j++;
					s[0] = 0;
				}
				i++;
			}
		}
		System.out.print(i);
		System.out.print(" ");
		for (period = 0;period < 1000;period++)
		{
			for (i = 0;i < 1000;i++)
			{
				if (x[i] <= period != 0 && y[i]> period)
				{
					count++;
				}
			}
			if (count > max)
			{
				max = count;
			}
			count = 0;
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

