package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String sieve = new String(new char[50001]);
		sieve = null;
		sieve = sieve.substring(0, 1);
		for (i = 2;i < 50001;i++)
		{
			sieve = tangible.StringFunctions.changeCharacter(sieve, i, 1);
		}
		for (i = 2;i < Math.sqrt(50001);i++)
		{
			if (sieve.charAt(i) == 1)
			{
				for (n = i * i;n < 50001;n += i)
				{
					sieve = sieve.substring(0, n);
				}
			}
		}
		int input;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			input = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= input;i += 2)
		{
			for (n = 3;n < i;n++)
			{
				if (sieve.charAt(n) == 1 && sieve.charAt(i - n) == 1)
				{
					System.out.printf("%d=%d+%d\n",i,n,i - n);
					break;
				}
			}
		}
	}

}

