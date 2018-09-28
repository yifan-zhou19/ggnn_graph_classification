package <missing>;

public class GlobalMembers
{
	public static int deal(String a, int n, String b, int m)
	{
		char c;
		String az = new String(new char[100]);
		String bz = new String(new char[100]);
		int i;
		int j;
		int t;
		for (j = 0;j < 100;j++)
		{
				az = tangible.StringFunctions.changeCharacter(az, j, '\0');
				bz = tangible.StringFunctions.changeCharacter(bz, j, '\0');
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i].equals(' ') || a[i].equals('\n'))
			{
				continue;
			}
			else if (a[i].compareTo('Z') <= 0 && a[i].compareTo('A') >= 0)
			{
				az = tangible.StringFunctions.changeCharacter(az, j, a[i].Substring(32));
				j++;
			}
			else
			{
				az = tangible.StringFunctions.changeCharacter(az, j, a[i]);
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (t = 0;t < j - 1 - i;t++)
			{
				if (az.charAt(t) > az.charAt(t + 1))
				{
				c = az.charAt(t);
				az = tangible.StringFunctions.changeCharacter(az, t, az.charAt(t + 1));
				az = tangible.StringFunctions.changeCharacter(az, t + 1, c);
				}
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (b[i].equals(' '))
			{
				continue;
			}
			else if (b[i].compareTo('Z') <= 0 && a[i].compareTo('A') >= 0)
			{
				bz = tangible.StringFunctions.changeCharacter(bz, j, b[i].Substring(32));
				j++;
			}
			else
			{
				bz = tangible.StringFunctions.changeCharacter(bz, j, b[i]);
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (t = 0;t < j - 1 - i;t++)
			{
				if (bz.charAt(t) > bz.charAt(t + 1))
				{
				c = bz.charAt(t);
				bz = tangible.StringFunctions.changeCharacter(bz, t, bz.charAt(t + 1));
				bz = tangible.StringFunctions.changeCharacter(bz, t + 1, c);
				}
			}
		}
		if (strcmp(az,bz) == 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int la;
		int lb;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("NO\n");
		}
		else if (deal(a, la, b, lb))
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

