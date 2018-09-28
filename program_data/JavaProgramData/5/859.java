package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int n;
		double m;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		n = a.length();
		if (a.length() != b.length())
		{
			System.out.print("error");
			return 0;
		}

		for (int i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		   if (a.charAt(i) == b.charAt(i))
		   {
			   k++;
		   }
		}
		if (1.0 * k / n > m)
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

