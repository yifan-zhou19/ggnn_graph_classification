package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[500]);
		String substring = new String(new char[50]);
		String replacement = new String(new char[50]);
		int same;
		int i;
		int k;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		for (i = 0;i < String.length();i++)
		{
			same = 1;
			for (k = 0;k < substring.length();k++)
			{
				if (String[i + k] != substring.charAt(k))
				{
					same = 0;
				}
			}
			if (same == 1)
			{
				System.out.printf("%s",replacement);
				c = i;
				break;
			}
			else
			{
				System.out.printf("%c",string.charAt(i));
			}

		}
		for (i = c + substring.length();i < String.length();i++)
		{
			System.out.printf("%c",string.charAt(i));
		}
		return 0;
	}
}

