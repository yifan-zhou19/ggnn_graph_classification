package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[100]);
		for (;;)
		{
			s = new Scanner(System.in).nextLine();
			int i;
			int j;
			int k = 0;
			int m = 0;
			int[] x = new int[15];
			int n = 0;
			if (s.charAt(0) == '-' && s.charAt(1) == '1')
			{
				break;
			}
			else
			{
				for (i = 0;;i++)
				{
					if (s.charAt(i) == '0')
					{
						break;
					}
					else
					{
						if ('1' <= s.charAt(i) && s.charAt(i) <= '9')
						{
							j = s.charAt(i) - '0';
							k = k * 10 + j;

						}
						else
						{
							x[m] = k;
							m++;
							k = 0;
						}

					}
				}
			}
			for (i = 0;i < m;i++)
			{
				for (j = i + 1;j < m;j++)
				{
					if ((x[i] / x[j] == 2 && x[i] % x[j] == 0) || (x[j] / x[i] == 2 && x[j] % x[i] == 0))
					{
						n++;
					}
				}
			}
				System.out.printf("%d\n",n);
		}
		return 0;
	}

}
