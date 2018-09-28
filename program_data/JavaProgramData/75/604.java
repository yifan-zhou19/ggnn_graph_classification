package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[1000];
	public static int[] y = new int[1000];
	public static int Main()
	{
		char b;
		int num = 0;
		int people;
		int max = 0;
		for (; 1;)
		{
			b = System.in.read();
			if ((b - '0' >= 0) && (b - '0' < 10))
			{
				x[num] *= 10;
				x[num] += b - '0';
			}
			if (b == ',')
			{
				num += 1;
			}
			if (b == '\n')
			{
				break;
			}
		}
		num = 0;
		for (; 1;)
		{
			b = System.in.read();
			if ((b - '0' >= 0) && (b - '0' < 10))
			{
				y[num] *= 10;
				y[num] += b - '0';
			}
			if (b == ',')
			{
				num += 1;
			}
			if (b == '\n')
			{
				break;
			}
		}
		for (int i = 0; i < 1000; i++)
		{
			people = 0;
			for (int ii = 0; ii < num + 1; ii++)
			{
				if (i >= x[ii] != 0 && i < y[ii])
				{
					people += 1;
				}
				if (people > max)
				{
					max = people;
				}
			}
		}
		System.out.print(num + 1);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}
}
