package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String s2 = new String(new char[500]);
		String temp1 = new String(new char[500]);
		String temp2 = new String(new char[500]);
		int len;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		len = s.length();
		for (i = 0;i < len;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s.charAt(len - i - 1));
		}
		s2 = s2.substring(0, len);
		for (i = 2;i <= len;i++)
		{
			for (k = 0;k <= len - i;k++)
			{
				for (j = 0;j < i;j++)
				{
					temp1 = tangible.StringFunctions.changeCharacter(temp1, j, s.charAt(j + k));
				}
				temp1 = temp1.substring(0, i);
				for (j = 0;j < i;j++)
				{
					temp2 = tangible.StringFunctions.changeCharacter(temp2, j, s2.charAt(len - k - i + j));
				}
				temp2 = temp2.substring(0, i);
				if (strcmp(temp1, temp2) == 0)
				{
					System.out.printf("%s\n", temp1);
				}
			}
		}
		return 0;
	}

}

