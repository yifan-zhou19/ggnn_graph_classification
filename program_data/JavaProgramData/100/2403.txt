package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[300]);
		String c = new String(new char[52]);
		ch = new Scanner(System.in).nextLine();
		int i;
		int b = 65;
		for (i = 0;i < 26;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, b);
			b++;
		}
		b = 97;
		for (i = 26;i < 52;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, b);
			b++;
		}
		int a;
		int j;
		int count = 0;
		int k = 0;
		a = ch.length();
		for (j = 0;j < 52;j++,count = 0)
		{

			for (i = 0;i < a;i++)
			{
			if (ch.charAt(i) == c.charAt(j))
			{
				count++;
			k++;
			}
			}
			if (count != 0)
			{
				System.out.printf("%c=%d\n",c.charAt(j),count);
			}
		}
		if (k == 0)
		{
				System.out.print("No");
		}
		return 0;
	}

}

