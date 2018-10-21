package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x = 0;
		double n;
		String su = new String(new char[500]);
		String zu = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			su = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			zu = tempVar3.charAt(0);
		}
	if (su.length() != zu.length())
	{
		System.out.print("error");
		return 0;
	}
	for (i = 0;i < su.length();i++)
	{
	if ((su.charAt(i) != 'A' && su.charAt(i) != 'T' && su.charAt(i) != 'G' && su.charAt(i) != 'C') || (zu.charAt(i) != 'A' && zu.charAt(i) != 'T' && zu.charAt(i) != 'G' && zu.charAt(i) != 'C'))
	{
		System.out.print("error");
		return 0;
	}
	if (su.charAt(i) == zu.charAt(i))
	{
	x++;
	}
	}
	if (x / (1.0 * su.length()) > n)
	{
		System.out.print("yes");
		return 0;
	}
	System.out.print("no");
		return 0;
	}
}

