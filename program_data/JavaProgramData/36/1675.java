package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[50]);
	String b = new String(new char[50]);
	int i;
	int j;
	int k;
	int len;
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
	if (i != len)
	{
		System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto end_of_evan;
	}
	len = len - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	death_and_rebirth:
	kill = 0;
	for (i = len;i >= 1;i--)
	{
			if (b.charAt(i) == a.charAt(len))
			{
				kill = 1;
				for (j = i;j < len;j++)
				{
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
				}
				len = len - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto NGE_loop;
			}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		NGE_loop:
		if (kill == 0)
		{
			System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end_of_evan;
		}
		else if (len >= 1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto death_and_rebirth;
		}

	if (kill == 1)
	{
		System.out.print("YES");
	}


//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end_of_evan:
	return 0;
	}
}

