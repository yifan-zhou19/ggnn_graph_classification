package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int s;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		s = n + k;
		e = s;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto abc;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	s = n + s;
		 e = s;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	abc:
	for (i = 2;i <= n;i++)
	{
			if ((n * e) % (n - 1) == 0)
			{
				e = n * e / (n - 1) + k;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
	}
		System.out.printf("%d",e);
	}
}

