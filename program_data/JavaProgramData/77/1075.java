package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final String p = "";
		char temp;
		char a;
		char b;
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		while (p.charAt(i) != '\0')
		{
			if (i == 0)
			{
				i++;
				continue;
			}
			if (p.charAt(i - 1) == p.charAt(i))
			{
				a = p.charAt(i - 1);
			}
			else
			{
				a = p.charAt(i - 1);
				b = p.charAt(i);
				if (a > b)
				{
					temp = a + 1;
				}
				else
				{
					temp = b + 1;
				}
				break;
			}
			i++;
		}
		i = 0;
		while (p.charAt(i) != '\0')
		{
			if (p.charAt(i) == b)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (p.charAt(j) == a)
					{
						System.out.printf("%d %d\n",j,i);
						p = tangible.StringFunctions.changeCharacter(p, j, temp);
						break;
					}

				}
			}
			i++;
		}
	}



}

