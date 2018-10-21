package <missing>;

public class GlobalMembers
{
	public static int change1(char a,int b,int c)
	{
		int d;
		if (a >= '0' && a <= '9')
		{
			a = a - '0';
		}
		else if (a >= 'a' && a <= 'z')
		{
			a = a - 'a' + 10;
		}
		else if (a >= 'A' && a <= 'Z')
		{
			a = a - 'A' + 10;
		}
		d = a * Math.pow(c,b);
		return d;
	}
	public static char change2(char a)
	{
		if (a >= 0 && a <= 9)
		{
			a = a + '0';
		}
		else if (a >= 10)
		{
			a = a + 'A' - 10;
		}
		return a;
	}

	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int sum = 0;
		String s = new String(new char[30]);
		String s2 = new String(new char[30]);
		String s3 = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = s.length();
		for (d = 0;d < c;d++)
		{
			sum += change1(s.charAt(c - d - 1), d, a);
		}
		if (sum == 0)
		{
			System.out.print("0");
			return 0;
		}
		for (e = 0;;e++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, e, sum % b);
			sum = sum / b;
			if (sum < b)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, e+1, sum);
				break;
			}
		}
		for (f = 0;f < 30;f++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, f, change2(s2.charAt(f)));
		}
		for (g = e+1;g >= 0;g--)
		{
			System.out.printf("%c",s2.charAt(g));
		}
	}




}

