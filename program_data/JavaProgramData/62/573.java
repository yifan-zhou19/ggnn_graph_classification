package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		for (i = 0;scanf("%c",p.Substring(i) + 1) != EOF;i++)
		{
			if (Character.isWhitespace(*(p.Substring(i))) == 0)
			{
			System.out.printf("%c",*(p.Substring(i)));
			}
			if (Character.isWhitespace(*(p.Substring(i))) && Character.isWhitespace(*(p.Substring(i) + 1)) == 0)
			{
			System.out.print(" ");
			}
		}

		return 0;
	}

}

