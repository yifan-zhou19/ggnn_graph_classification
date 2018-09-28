package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i1;
		int i2;
		int k;
		int a;
		int b = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i1 = 3; i1 <= (m / 2); i1 += 2)
		{
			a = Math.sqrt(m);
			b = 0;
			for (k = 2; k <= a; k++)
			{
				if (k == i1)
				{
					break;
				}
				if (i1 % k == 0)
				{
					b = b + 1;
				}
			}
			if (b == 0)
			{
				i2 = m - i1;
				b = 0;
				for (k = 2; k <= a; k++)
				{
					if (k == i2)
					{
						break;
					}
					 if (i2 % k == 0)
					 {
						b = b + 1;
					 }
				}
			}
			if (b == 0)
			{
				System.out.print(i1);
				System.out.print(" ");
				System.out.print(i2);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

