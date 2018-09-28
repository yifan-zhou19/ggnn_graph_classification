package <missing>;

public class GlobalMembers
{
	//******************************************
	//*???.cpp                    **
	//*??: ??     1100012808              **
	//*???2011.12.                       **
	//******************************************
	public static int Main() //???
	{ //?????
		int n;
		int[] t = new int[100000];
		int i;
		int flag = 0;
		double x;
		double max = 0.0;
		double sum = 0.0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += t[i];
		}
		x = sum / n;
		for (i = 0; i < n; i++)
		{
			if (Math.abs(x - t[i]) > max)
			{
				max = Math.abs(x - t[i]);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs((x - t[i]) - max) < 1e-5)
			{
				System.out.print(t[i]);
				flag = 1;
				break;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(t[i] - x - max) < 1e-5)
			{
				if (flag != 0)
				{
					System.out.print(",");
				}
				System.out.print(t[i]);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	} //?????

}

