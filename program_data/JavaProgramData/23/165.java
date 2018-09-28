package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		char c;
		int i;
		int j;
		i = 0;
		j = 0;
		c = 'A';
		while (c != '\n')
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c != ' ' && c != '\n')
			{
				a.charAt(i)[j] = c;
				j = j + 1;
			}
			else if (c == ' ')
			{
				i = i + 1;
				j = 0;
			}
		}
		for (j = i;j > 0;j = j - 1)
		{
			System.out.printf("%s ",a.charAt(j));
		}
		System.out.printf("%s",a.charAt(0));
	}

}

