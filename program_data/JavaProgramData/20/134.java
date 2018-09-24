package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l = 0;
		int i = 0;
		final String str = "";
		final String substr = "";
		final String str2 = "";
		String p;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	LOOP:
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		substr = tempVar2.charAt(0);
	}
		if (strcmp(str2,str) == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto END;
		}
		  l = str.length();
		p = str;
		for (i = 0;i < l;i++)
		{
			if (p < str.charAt(i))
			{
				p = str.charAt(i);
			}
			else
			{
				;
			}
		}

		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",str.charAt(i));
			if (str.charAt(i) == p)
			{
				System.out.printf("%s",substr);
			}

		}
		System.out.print("\n");
		str2 = str;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto LOOP;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	END:
	;
	}

}

