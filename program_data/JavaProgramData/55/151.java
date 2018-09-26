package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int t;
		int i;
		int p = 0;
		int e;
		int j;
		int f = 1;
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		t = c.length();
		for (i = t - 1;i >= 0;i--)
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 91)
			{
				p += f * (c.charAt(i) - 55);
			}
			else if (c.charAt(i) >= 97 && c.charAt(i) <= 123)
			{
				p += f * (c.charAt(i) - 87);
			}
			else if (c.charAt(i) >= 48 && c.charAt(i) <= 57)
			{
				p += f * (c.charAt(i) - 48);
			}
			f = f * a;

		}
		for (j = 0;;j++)
		{
			e = p % b;
			p = p / b;
			if (e >= 0 && e <= 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, e + '0');
			}
			else if (e >= 10 && e <= 35)
			{
			d = tangible.StringFunctions.changeCharacter(d, j, e-10 + 'A');
			}
			if (p == 0)
			{
				break;
			}
		}
		for (i = j;i >= 0;i--)
		{
			System.out.printf("%c",d.charAt(i));
		}
		System.out.print("\n");



		return 0;

	}
}

