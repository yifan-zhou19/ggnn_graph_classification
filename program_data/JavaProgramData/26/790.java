package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		cin.get(a,105,'\n');

		int len = a.length();
		int i = 0;
		for (;i < 101;i++)
		{
			int j;
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j <= len;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				len--;
				i--;
			};
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

