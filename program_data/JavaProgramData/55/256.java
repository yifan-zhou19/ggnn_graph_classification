package <missing>;

public class GlobalMembers
{
	public static int zheng(char x)
	{
		int m;
		if (x >= 'a' && x <= 'z')
		{
			m = x - 87;
		}
		else if (x >= 'A' && x <= 'Z')
		{
			m = x - 55;
		}
		else
		{
			m = x - 48;
		}
		return m;
	}
	public static char fan(int x)
	{
		char m;
		if (x >= 0 && x <= 9)
		{
			m = x + 48;
		}
		else if (x >= 10 && x <= 35)
		{
			m = x + 55;
		}
		return m;
	}

	public static int Main()
	{
		int n;
		int m;
		int f;
		int sum = 0;
		int wei = 0;
		int i;
		String zhuan = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String x = new String(new char[10]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		f = x.length();
		for (i = 0;i < f;i++)
		{
				sum += zheng(x.charAt(i)) * Math.pow(n,f - i - 1);
		}
		for (i = 49;i >= 0;i--)
		{
			zhuan = tangible.StringFunctions.changeCharacter(zhuan, i, fan(sum % m));
			wei++;
			sum = sum / m;
			if (sum == 0)
			{
				break;
			}
		}
		for (i = 50 - wei;i < 50;i++)
		{
			System.out.printf("%c",zhuan.charAt(i));
		}
		return 0;
	}
}

