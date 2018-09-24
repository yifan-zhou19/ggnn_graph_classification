package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	int n;
	String a = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	int x;
	int i;
	int t = 0;
	x = a.length();
	for (i = 0;i <= x - 1;i++)
	{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				t = t * m + a.charAt(i) - 48;
			}
		else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
			t = t * m + a.charAt(i) - 87;
		}
		else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		{
			t = t * m + a.charAt(i) - 55;
		}
	}

	String b = new String(new char[100]);
	for (i = 0;i <= 99;i++)
	{
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	}
	for (i = 99;t != 0;i--)
	{
			if (t % n >= 0 && t % n <= 9)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, t % n + 48);
				t = t / n;
			}
		else if (t % n >= 10)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, t % n + 55);
			t = t / n;
		}
	}
	for (i = 0;b.charAt(i) == '\0' && i <= 99;i++)
	{
	}
	if (i == 100)
	{
		System.out.print("0");
	}
	for (i;i <= 99;i++)
	{
		System.out.print(b.charAt(i));
	}

	System.out.print("\n");
	}

}

