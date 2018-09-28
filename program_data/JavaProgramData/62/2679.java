package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		String kj = new String(new char[1000]);
		kj = new Scanner(System.in).nextLine();
		a = kj.length();
		b = a;
		for (i = 0;i < a;i++)
		{
			if (kj.charAt(i) == ' ')
			{
				if (kj.charAt(i + 1) == ' ')
				{
					for (j = i + 1;j < a;j++)
					{
						kj = tangible.StringFunctions.changeCharacter(kj, j - 1, kj.charAt(j));
					}
				b--;
				i--;
				}
			}
		if (i == b - 1)
		{
			break;
		}
		}
		for (i = 0;i < b;i++)
		{
		System.out.printf("%c",kj.charAt(i));
		}
		return 0;
	}

}

