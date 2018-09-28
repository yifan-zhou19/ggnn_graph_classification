package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	final String a = "er";
	final String b = "ly";
	final String c = "ing";
	final String d = "\0";
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//char s[30];
	//}
	//p[60];
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
		p[i].s = tempVar2;
	}
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < String.valueOf(p[i].s).length();j++)
		{
		if (strcmp((p[i].s + j),a) == 0)
		{
			(p[i].s + j) = d;
		}
		else if (strcmp((p[i].s + j),b) == 0)
		{
			(p[i].s + j) = d;
		}
		else if (strcmp((p[i].s + j),c) == 0)
		{
			(p[i].s + j) = d;
		}
		}
	}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[i].s);
		}
		return 0;
	}
}

