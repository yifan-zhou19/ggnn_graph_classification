package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String s = new String(new char[1000]);
		String j = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			j = tempVar3.charAt(0);
		}
		if (s.length() != j.length())
		{
			System.out.print("error");
			return 0;
		}
		int k;
		k = s.length();
		int sum = 0;
		double rate;
		int i;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != 'A' && s.charAt(i) != 'G' && s.charAt(i) != 'C' && s.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
			if (j.charAt(i) != 'A' && j.charAt(i) != 'G' && j.charAt(i) != 'C' && j.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}

			if (s.charAt(i) == j.charAt(i))
			{
				sum++;
			}
		}
		rate = 1.0 * sum / k;
		if (rate > n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

