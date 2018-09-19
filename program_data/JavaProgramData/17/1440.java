package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] left = new int[100];
		int k = 0;
		int len;
		int i;
		while (scanf("%s", a) != EOF)
		{
			len = a.length();
			System.out.println(a);
			for (i = 0;i < len;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 32);
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(')
				{
				k++;
				left[k] = i;

				}
			}
			for (;k > 0;k--)
			{
				for (i = left[k];i < len;i++)
				{
					if (a.charAt(i) == ')')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, left[k], ' ');
						break;
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '(')
				{
				b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
			if (a.charAt(i) == ')')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '?');
			}
			}
			for (i = 0;i < len;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

