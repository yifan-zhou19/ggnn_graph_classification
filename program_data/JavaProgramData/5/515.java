package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		float x;
		String m = new String(new char[501]);
		String n = new String(new char[501]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Float.parseFloat(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = tempVar3.charAt(0);
	}
	if (m.length() != n.length())
	{
		System.out.print("error");
		return 0;
	}
	for (i = 0;n.charAt(i);i++)
	{
		if (m.charAt(i) != 'A' && m.charAt(i) != 'T' && m.charAt(i) != 'C' && m.charAt(i) != 'G' || (n.charAt(i) != 'A' && n.charAt(i) != 'T' && n.charAt(i) != 'C' && n.charAt(i) != 'G'))
		{
			System.out.print("error");
			return 0;
		}
		if (m.charAt(i) == n.charAt(i))
		{
			j++;
		}
	}
	if (1.0 * j / i > x)
	{
		System.out.print("yes");
	}
	if (1.0 * j / i < x)
	{
		System.out.print("no");
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		i = Integer.parseInt(tempVar4);
	}
	return 0;
	}

}

