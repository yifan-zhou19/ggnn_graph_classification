package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[15];
	public static int Main()
	{
		int num;
		int doub;
		char b;
		int comp_with_zero;
		for (; 1;)
		{
			num = 0;
			doub = 0;
			comp_with_zero = 1;
			b = 'a';
			for (int ai = 0; ai < 15; ai++)
			{
				a[ai] = 0;
			}
			for (; 1;)
			{
				b = System.in.read();
				if ((b == '0') && (a[num] == 0))
				{
					break;
				}
				if ((b - '0' < 10) && (b - '0' >= 0))
				{
					a[num] *= 10;
					a[num] += (b - '0');
				}
				else
				{
					if (b == ' ')
					{
						a[num] *= comp_with_zero;
						num += 1;
						comp_with_zero = 1;
					}
					if (b == '-')
					{
						comp_with_zero = -1;
					}
				}
			}
			for (int i = 0; i <= num; i++)
			{
				for (int ii = i; ii <= num; ii++)
				{
					if (a[i] == 0)
					{
						break;
					}
					if ((a[i] % 2 == 0) && (a[i] / 2 == a[ii]))
					{
							doub += 1;
					}
					if ((a[ii] % 2 == 0) && (a[ii] / 2 == a[i]))
					{
						doub += 1;
					}
				}
			}
			System.out.print(doub);
			System.out.print("\n");
		}
		return 0;
	}

}
