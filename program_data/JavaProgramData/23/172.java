package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int c = 0;
		int[] d = new int[100];
		int e = 0;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == ' ')
			{
				d[e] = i;
				e++;
			}
		}
		for (;e > 0;e--)
		{
			for (i = (d[e-1] + 1);;i++)
			{
				if (a.charAt(i) == ' ' || a.charAt(i) == '\0')
				{
					break;
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(i));
					c++;
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, c, ' ');
			c++;
		}
		for (i = 0;i < a.charAt((d[0]));i++)
		{
		if (a.charAt(i) != ' ')
		{
			b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(i));
			c++;
		}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
	}
}

