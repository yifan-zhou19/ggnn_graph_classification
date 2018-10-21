package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1001]);
	String t = new String(new char[1001]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	int[] b = new int[1001];
	int i;
	int j;
	int k;
	int h;
	int p = 0;
	b[0] = 1;
	k = a.length();
	for (h = 0;h <= k - 1;h++)
	{
		if (a.charAt(h) >= 'a' && a.charAt(h) <= 'z')
		{
			a = tangible.StringFunctions.changeCharacter(a, h, a.charAt(h) + ('A'-'a'));
		}
	}
	if (k == 1)
	{
		System.out.printf("(%c,1)",a.charAt(0));
	}
	else
	{
	for (i = 0;i <= k - 2;i++)
	{
	 t = tangible.StringFunctions.changeCharacter(t, p, a.charAt(i));
	 if (a.charAt(i) == a.charAt(i + 1))
	 {
		 b[p]++;
	 }
	 else
	 {
		 p++;
		 t = tangible.StringFunctions.changeCharacter(t, p, a.charAt(i + 1));
		 b[p] = 1;
	 }
	}
	for (j = 0;j <= p;j++)
	{
		System.out.printf("(%c,%d)",t.charAt(j),b[j]);
	}
	}
	}

}

