package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[51]);
	String b = new String(new char[51]);
	int i;
	int j;
	int k;
	int l;
	int len;
	int num;
	int kill;
	i = 0;
	do
	{
		i++;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
		}
	} while (a.charAt(i) != ' ');
	len = i;
	i = 0;
	do
	{
		i++;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
		}
	} while (b.charAt(i) != '\n');
	num = i;
	l = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	bomarc_loop:
	for (i = l;i <= num;i++)
	{
	kill = 0;
	l = i;
			for (j = 1;j <= len;j++,l++)
			{
				if (a.charAt(j) == b.charAt(l))
				{
					kill++;
				}
			}
			if (kill == len - 1)
			{
				System.out.printf("%d",i - 1);
				break;
			}
	}

	return 0;
	}
}

