package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int j;
	int k;
	int l;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String x = new String(new char[100]);
	String y = new String(new char[100]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = tempVar2.charAt(0);
	}
	j = x.length();
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = tempVar3.charAt(0);
	}
	k = y.length();
	for (l = k - 1;l >= 0;l--)
	{
		x = tangible.StringFunctions.changeCharacter(x, j - k + l, x.charAt(j - k + l) - y.charAt(l) + 48);
		if (x.charAt(j - k + l) < 48)
		{
			x.charAt(j - k + l) += 10;
			x.charAt(j - k + l - 1)--;
		}
	}
	System.out.printf("%s",x);
	System.out.print("\n");
	}
	}
}

