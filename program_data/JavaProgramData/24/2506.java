package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d = 0;
		int i = 0;
		int num = 0;
		int max;
		int imax = 0;
		int min;
		int imin = 0;
		char[][] a = new char[200][30];
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (d == 1 && c != ' ' && c != ',')
			{
				a[i][num++] = c;
			}
			if (d == 0 && c != ' ' && c != ',')
			{
				d = 1;
				a[i][num++] = c;
			}
			if (d == 1 && (c == ' ' || c == ','))
			{
				d = 0;
				a[i][num] = '\0';
				if (i == 0)
				{
					max = num;
					min = num;
				}
				if (num > max)
				{
					max = num;
					imax = i;
				}
				if (num < min)
				{
					min = num;
					imin = i;
				}
				num = 0;
				i++;
			}
		}
		if (d == 1)
		{
			a[i][num] = '\0';
			if (num > max)
			{
				max = num;
				imax = i;
			}
			if (num < min)
			{
				min = num;
				imin = i;
			}
		}
		System.out.println(a[imax]);
		System.out.println(a[imin]);
		return 0;
	}
}
