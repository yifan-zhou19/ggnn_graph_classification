package <missing>;

public class GlobalMembers
{
	/* Name      : ??13 
	 * Version   : 1.0
	 * Date      : 2012-12-16
	 * New       : Null
	 * Func&Feat : ????? 
	 * State     : Design
	 */
	public static int Main()
	{
		char c;
		char[] Dividend = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int N;
		for (int i = 0;(c = System.in.read()) != '\n';i++)
		{
			Dividend[i] = c;
			N = i + 1;
		}
		int[] PartQuotient = new int[100];
		int[] PartRemainder = new int[100];
		if (N == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print((int)(Dividend[0] - 48));
			System.out.print("\n");
		}
		else
		{
			for (int i = 0;i < N;i++)
			{
				int PartDividend;
				if (i == 0)
				{
					PartDividend = Dividend[i] - 48;
				}
				else
				{
					PartDividend = 10 * PartRemainder[i - 1] + (Dividend[i] - 48);
				}
				//cout<<i<<' '<<PartDividend<<endl;
				PartQuotient[i] = PartDividend / 13;
				PartRemainder[i] = PartDividend % 13;
				//cout<<i<<' '<<PartQuotient[i]<<' '<<PartRemainder[i]<<endl;
				if ((i < 2 && PartQuotient[i] == 0 && Dividend[i + 1] != 0) == 0)
				{
					System.out.print(PartQuotient[i]);
				}
			}
			System.out.print("\n");
			System.out.print(PartRemainder[N - 1]);
			System.out.print("\n");
		}
		return 0;
	}

}
