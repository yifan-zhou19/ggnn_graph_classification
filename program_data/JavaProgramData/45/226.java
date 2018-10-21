package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int c;
		int d;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		c = a.length();
		d = b.length();
		a = tangible.StringFunctions.changeCharacter(a, c, '\0');
		b = tangible.StringFunctions.changeCharacter(b, d, '\0');
		for (j = 0;j < d - c + 1;j++)
		{
			for (t = 0;t <= c;t++)
			{
				if ((b.charAt(j + t) - a.charAt(t)) != 0)
				{
					break;
				}
			}
			if (t == c)
			{
				break;
			}
		}
		if (j <= d - c)
		{
			System.out.printf("%d",j);
		}
		else if (j == d - c + 1)
		{
			for (k = 0;k <= c;k++)
			{
				if (b.charAt(k + d - c) != a.charAt(k))
				{
					break;
				}
			}
			if (k == c + 1)
			{
				System.out.printf("%d",d - c);
			}
		}
	}







}

