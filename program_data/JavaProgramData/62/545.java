package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		char c;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc((Character.SIZE / Byte.SIZE));
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				c = tempVar.charAt(0);
			}
			if (c == '\n')
			{
				*(p.Substring(i)) = '\0';
				break;
			}
			else
			{
				*(p.Substring(i)) = c;
			}
		}
		for (i = 0;;i++)
		{
			c = (p.Substring(i));
			if (c == '\0')
			{
				break;
			}
			else if (c != ' ')
			{
				System.out.printf("%c",c);
			}
			else if (c == ' ' && *(p.Substring(i) - 1) != ' ')
			{
				System.out.printf("%c",c);
			}
		}
		return 0;
	}
}

