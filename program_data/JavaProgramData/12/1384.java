package <missing>;

public class GlobalMembers
{
	//***************************
	//*?????              **
	//*?????? 1300013007 **
	//*???2013.10.30        **
	//***************************
	public static int Main()
	{
		int k;
		int i;
		int m = 0;
		int number;
		double[] a = new double[15];
		do
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (number == -1)
			{
				break;
			}
			else
			{
				a[0] = number;
			}
			for (i = 2; ; i++)
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i - 1] = number;
				for (k = 0; k < i - 1; k++)
				{
					if (a[i - 1] == (2 * a[k]) || a[i - 1] == (a[k] / 2))
					{
						m++;
					}
				}
				if (number == 0)
				{
					System.out.print("\n");
					System.out.print(m);
					System.out.print("\n");
					break;
				}
			}
			m = 0;
		}while (1 != 0);
		return 0;
	}



}

