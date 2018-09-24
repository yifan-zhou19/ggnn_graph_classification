package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		int i;
		int j = 0;
		int k = 0;
		int m;
		cin.get(a,100,'\n');
		for (k = 0;k <= 100;k++)
		{
		  for (i = 0;i <= 100;i++)
		  {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j <= 100;j++)
				{
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
			}
		  }
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
		System.out.print(a.charAt(i));
		}
		return 0;
	}
}

