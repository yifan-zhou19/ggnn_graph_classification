package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double m;
		char[][] jianji = new char[2][501];
		int len1;
		int len2;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jianji[0] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jianji[1] = tempVar3.charAt(0);
		}
		len1 = String.valueOf(jianji[0]).length();
		len2 = String.valueOf(jianji[1]).length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if ((jianji[0][i] != 'A' && jianji[0][i] != 'T' && jianji[0][i] != 'C' && jianji[0][i] != 'G') || (jianji[1][i] != 'A' && jianji[1][i] != 'T' && jianji[1][i] != 'C' && jianji[1][i] != 'G'))
				{
					System.out.print("error");
					return 0;
				}
				else if (jianji[0][i] == jianji[1][i])
				{
					sum += 1;
				}
			}
			m = (1.0 * sum) / len1;
			if (m > n)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

