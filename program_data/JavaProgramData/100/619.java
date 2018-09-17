package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int length;
		String a = new String(new char[300]);
		char zimu = 'a';
		int i;
		int j;
		int[] cishu = new int[26];
		int zero = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		length = a.length();

		for (i = 0;i < length;i++)
		{
			zimu = 'a';
			for (j = 0;j < 26;j++)
			{
				if (a.charAt(i) == zimu)
				{
					cishu[j]++;
					break;
				}
				else
				{
					zimu++;
				}




			}
		}


		zimu = 'a';
		for (j = 0;j < 26;j++)
		{
			if (cishu[j] != 0)
			{
				System.out.printf("%c=%d\n",zimu,cishu[j]);
			}

			zimu++;
		}

		for (j = 0;j < 26;j++)
		{
			if (cishu[j] == 0)
			{
				zero++;
			}
		}

		if (zero == 26)
		{
			System.out.print("No");
		}

		return 0;
	}

}

