package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int a1 = -1;
		int a2 = -1;
		int alast;
		int blength;
		int i;
		int j;
		int n;
		a = new Scanner(System.in).nextLine();
		alast = a.length();
		blength = 0;
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ')
			{
			a1 = i;
			break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
			a2 = i;
			break;
			}
		}
		if ((a1 != -1) && (a2 != -1))
		{
		for (i = n - 1;i >= a1;i--)
		{
			if (a.charAt(i) == ' ')
			{
				for (j = 0;j < alast - 1 - i;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, blength + j, a.charAt(i + 1 + j));
				}
				b = tangible.StringFunctions.changeCharacter(b, blength + alast - 1 - i, ' ');
				blength = blength + alast - i;
				alast = i;
			}
		}
		for (i = a2;i < a1;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, blength + i, a.charAt(a2 + i));
		}
		for (i = 0;i < n - a2;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		}
		else if (a1 == -1)
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}

	}
}

