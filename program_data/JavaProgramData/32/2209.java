package <missing>;

public class GlobalMembers
{
	public static void subtraction(String big, String small, int n)
	{
		int i;
		for (i = n;i >= 0;i--)
		{
			if (big[i] - small[i] >= 0 != null)
			{
				big[i] = big[i] - small[i] + '0';
			}
			else
			{
				big[i] = big[i] - small[i].Substring(10) + '0';
				small[i - 1] = small[i - 1].Substring(1);
			}
		}
	}

	public static void Main()
	{
		String numbig = new String(new char[100]);
		String numsmall = new String(new char[100]);
		int i;
		int j;
		int lennumbig;
		int lennumsmall;
		int n;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				numbig = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				numsmall = tempVar3.charAt(0);
			}
			System.in.read();

			lennumbig = numbig.length();
			lennumsmall = numsmall.length();

			for (i = lennumbig,j = lennumsmall;i >= lennumbig - lennumsmall;i--,j--)
			{
				numsmall = tangible.StringFunctions.changeCharacter(numsmall, i, numsmall.charAt(j));
			}
			for (i = 0;i < lennumbig - lennumsmall;i++)
			{
				numsmall = tangible.StringFunctions.changeCharacter(numsmall, i, '0');
			}

			subtraction(numbig, numsmall, lennumbig - 1);

			System.out.println(numbig);
		}
	}
}

