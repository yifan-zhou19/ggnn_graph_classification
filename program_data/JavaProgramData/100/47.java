package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[302]);
		int[] b = new int[26];
		String c = new String(new char[26]);
		int i;
		int j;
		int p;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i <= 25;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, 97 + i);
		}
		for (i = 0;i <= 25;i++)
		{
			b[i] = 0;
		}
		p = 0;
		for (i = 0;i <= 25;i++)
		{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == 97 + i)
				{
					b[i]++;
				}
			}
			if (b[i] != 0)
			{
				System.out.printf("%c=%d\n",c.charAt(i),b[i]);
				p = 1;
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
	}
}

