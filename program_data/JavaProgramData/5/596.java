package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double n;
		double j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		if (a.length() != b.length())
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G') && (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G'))
			{
			if (a.charAt(i) == b.charAt(i))
			{
				j++;
			}
			}
		else
		{
			System.out.print("error");
			return 0;
		}
		}
		i = a.length();
		j = j / i;
		if (j > n)
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

