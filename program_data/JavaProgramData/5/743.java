package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		double realrate;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int len;
		int lenb;
		int yes = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
		}

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}

		len = a.length();
		lenb = b.length();
		if (len != lenb)
		{
			System.out.print("error");
			return 0;
		}

		for (int i = 0;a.charAt(i) != '\0';i++)
		{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
				{
					System.out.print("error");
					return 0;
				}

				if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
					System.out.print("error");
					return 0;
				}
				if (a.charAt(i) == b.charAt(i))
				{
					yes++;
				}
		}
		realrate = 1.0 * yes / len;
		if (realrate >= rate)
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

