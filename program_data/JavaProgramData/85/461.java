package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		String word = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			l = word.length();
			if (word.charAt(0) <= 'z' && word.charAt(0) >= 'a' || word.charAt(0) <= 'Z' && word.charAt(0) >= 'A' || word.charAt(0) == ' ' || word.charAt(0) == '_')
			{
				;
			}
			else
			{
					System.out.print("no\n");
					continue;
			}
			for (j = 1;j < l;j++)
			{
					if (word.charAt(j) <= '9' && word.charAt(j) >= '0' || word.charAt(j) <= 'z' && word.charAt(j) >= 'a' || word.charAt(j) <= 'Z' && word.charAt(j) >= 'A' || word.charAt(j) == ' ' || word.charAt(j) == '_')
					{
						;
					}
					else
					{
						System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto MQ;
					}

			}
			System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	MQ:
	;
		}
		return 0;
	}

}

