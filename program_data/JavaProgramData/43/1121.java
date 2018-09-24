package <missing>;

public class GlobalMembers
{
	//****************************
	//**Title??????       **
	//**Author:?? 1300012732  **
	//**Date?2013.10.23        **
	//**File?1.cpp             **
	//****************************

	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 3; i <= m / 2; i += 2)
		{
			int r1;
			int j;
			for (j = 2; j <= Math.sqrt(i); j++)
			{
				r1 = i % j;
				if (r1 == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				int n;
				int r2;
				int k;
				n = m - i;
				for (k = 2; k <= Math.sqrt(n); k++)
				{
					r2 = n % k;
					if (r2 == 0)
					{
						break;
					}
				}
				if (k > Math.sqrt(n))
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(n);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

