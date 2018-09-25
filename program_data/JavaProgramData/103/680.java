package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String str = new String(new char[1000]);

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			for (j = 0;str.charAt(j);j++)
			{
				if (str.charAt(j) <= 'z' && str.charAt(j) >= 'a')
				{
				  str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) - 32);
				}
			}
			for (i = 0,n = 1;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == str.charAt(i + 1))
				{
					n = n + 1;
				}

				else
				{
					System.out.printf("(%c,%d)",str.charAt(i),n);
					n = 1;
				}
			}
	}
}

