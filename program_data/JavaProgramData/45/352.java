package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int len;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len = s.length();
		for (i = 1;w.charAt(i) != '\0';i++)
		{
			if (s.charAt(0) == w.charAt(i))
			{
			for (j = 1;j < len;j++)
			{
				if (s.charAt(j) != w.charAt(i + j))
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto label;
				}
			}
			System.out.printf("%d",i);
			break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			label:
			;
			}
		}
		return 0;
	}
}

