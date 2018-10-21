package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int s;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	t = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	add:
	;
	t = t + 1;
	s = n - 2 + t;
	for (i = 1;i <= n;i++)
	{
	if (s % (n - 1) != 0)
	{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto add;
	}
	s = s / (n - 1) * n + k;
	}
	System.out.printf("%d",s);
	return 0;
	}


}

