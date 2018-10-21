package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
	int time;
	int r;
	int i;
	int s;
	int t;
	int u;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		time = Integer.parseInt(tempVar);
	}
	for (r = 1;r <= time;r++)
	{
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
		t = b.length();
		u = a.length();
		for (i = t - 1;i >= 0;i--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i + u - t, b.charAt(i));
		}
		for (i = 0;i < u - t;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = u - 1;i >= 0;i--)
		{
			if (a.charAt(i) >= b.charAt(i))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i) + '0');
			}
		 else
		 {
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(i) + '0' + 10);
			 a.charAt(i - 1)--;
		 }
		}
		s = 0;
		for (i = 0;i < u;i++)
		{
			if (a.charAt(i) == '0')
			{
				s++;
			}
		 else
		 {
			 break;
		 }
		}
		for (i = s;i < u;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
	System.out.print("\n");
	}
	}

}

