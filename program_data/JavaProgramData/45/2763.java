package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[60]);
	String w = new String(new char[60]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		w = tempVar2.charAt(0);
	}
	int n = s.length();
	int m = w.length();
	for (int i = 0;i + n <= m;i++)
	{
		for (int j = 0;j < n;j++)
		{
			if (s.charAt(j) != w.charAt(i + j))
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto P;
			}
		}
		System.out.printf("%d",i);
		break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		P:
		continue;
	}
	}

}

