package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[200]);
		String temp = new String(new char[200]);
		int n;
		int i;
		int figure;
		int[] tempnum = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (gets(ch))
		{
			figure = 0;
			for (i = 0;ch.charAt(i) != '\0';i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, ' ');
				switch (ch.charAt(i))
				{
				case '(':
					tempnum[figure++] = i;
					temp = tangible.StringFunctions.changeCharacter(temp, i, '$');
					break;
				case ')':
					if (figure > 0)
					{
						figure--;
						temp = tangible.StringFunctions.changeCharacter(temp, tempnum[figure], ' ');
					}
					else
					{
						temp = tangible.StringFunctions.changeCharacter(temp, i, '?');
					}
					break;
				}
			}
			temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			System.out.printf("%s\n%s\n",ch,temp);
		}
	}
}

