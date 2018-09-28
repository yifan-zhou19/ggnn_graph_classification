package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int[] k = new int[255];
		int c;
		int d;
		int e;
		int i;
		int f;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = (int)a.length();
		d = (int)b.length();
		for (i = 0;i < c / 2;i++)
		{
			e = a.charAt(i);
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(c - 1 - i));
			a = tangible.StringFunctions.changeCharacter(a, c - 1 - i, e);
		}
		for (i = 0;i < d / 2;i++)
		{
			f = b.charAt(i);
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(d - 1 - i));
			b = tangible.StringFunctions.changeCharacter(b, d - 1 - i, f);
		}
		if (c > d)
		{
			for (i = 0;i < d;i++)
			{
				k[i] = a.charAt(i) + b.charAt(i) - '0'-'0' + k[i];
			}
			for (i = d;i < c;i++)
			{
				k[i] = k[i] + a.charAt(i) - '0';
			}
			for (i = 0;i < c;i++)
			{
				k[i + 1] = k[i + 1] + k[i] / 10;
				k[i] = k[i] % 10;
			}
			for (i = c;i >= 0;i--)
			{
				c = i;
				if (k[i] != 0)
				{
					break;
				}
			}
			for (i = c;i >= 0;i--)
			{
				System.out.printf("%d",k[i]);
			}
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				k[i] = a.charAt(i) + b.charAt(i) - '0'-'0' + k[i];
			}
			for (i = c;i < d;i++)
			{
				k[i] = k[i] + b.charAt(i) - '0';
			}
			for (i = 0;i < d;i++)
			{
				k[i + 1] = k[i + 1] + k[i] / 10;
				k[i] = k[i] % 10;
			}
			for (i = d;i >= 0;i--)
			{
				d = i;
				if (k[i] != 0)
				{
					break;
				}
			}
			for (i = d;i >= 0;i--)
			{
				System.out.printf("%d",k[i]);
			}
		}
		return 0;
	}

}

