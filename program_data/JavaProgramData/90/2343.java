package <missing>;

public class GlobalMembers
{
	//****************************
	//*????????         **
	//*?????? 1300012965  **
	//*???20131127			**
	//****************************
	public static int apple(int mf, int nf)
	{
		if (nf == 1)
		{
			return 1;
		}
		if (mf == 0)
		{
			return 1;
		}
		if (mf >= nf)
		{
			return apple(mf, nf - 1) + apple(mf - nf, nf);
		}
		if (mf < nf)
		{
			return apple(mf, nf - 1);
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int num;
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= j; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = apple(m, n);
			System.out.print(num);
			System.out.print("\n");
		}


		return 0;
	}
}

