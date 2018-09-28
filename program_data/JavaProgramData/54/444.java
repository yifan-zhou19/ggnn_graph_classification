package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 1;
		int n;
		int k;
		int m;
		int j;
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
		j = 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	abc:
		m = j * n + k;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	def:
		if (m % (n - 1) == 0 && i < n)
		{
		  m = m / (n - 1) * n + k;
		  i = i + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto def;
		}
		if (m % (n - 1) && i < n)
		{
			i = 1;
			j = j + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto abc;
		}
		if (i == n)
		{
			System.out.printf("%d",m);
		}

	}
}

