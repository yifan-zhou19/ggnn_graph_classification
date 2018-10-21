package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int count = 0;
		String line = new String(new char[200]);
		char tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		tmp = line.charAt(0);
		for (i = 0;line.charAt(i);i++)
		{
			count++;
		}
		for (i = 0;line.charAt(i);i++)
		{
			if (line.charAt(i) == tmp) //???
			{
				for (j = i + 1;line.charAt(j);j++)
				{
					if (line.charAt(j) == tmp)
					{
						break;
					}
					else if (line.charAt(j) != tmp && line.charAt(j) != '0') //???
					{
						System.out.printf("%d %d\n",i,j);
						line = tangible.StringFunctions.changeCharacter(line, i, line[j] = '0');
						i = 0;
						break;
					}
				}
			}
		}
		System.out.printf("0 %d\n",count - 1);
		return 0;
	}
}

