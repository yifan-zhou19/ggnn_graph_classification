package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[11]);
		String b = new String(new char[4]);
		char max;
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int y = 0;
		int temp;
		for (i = 0;i < 11;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
		}
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			temp = 0;
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			max = a.charAt(0);
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) > max)
				{
					max = a.charAt(j);
					temp = j;
				}
			}
			for (k = 0;k <= temp;k++)
			{
				System.out.print(a.charAt(k));
			}
			for (m = 0;m < 3;m++)
			{
				System.out.print(b.charAt(m));
			}
			for (y = temp + 1;y < a.length();y++)
			{
				System.out.print(a.charAt(y));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

