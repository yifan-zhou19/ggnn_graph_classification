package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 0;
		int j = 0;
		int n;
		int m;
		int loop;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	while (n != 0)
	{
		a[i] = n;
		 n = n / 2;
	 i++;
	}
	while (m != 0)
	{
	b[j] = m;
	m = m / 2;
	j++;
	}
	for (i = 0;i < 1000;i++)
	{
	for (j = 0;j < 1000;j++)
	{
	if (a[i] == b[j])
	{

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto loop;
	}
	else
	{
	continue;
	}

	}
	}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	System.out.printf("%d\n",a[i]);
	return 0;
	}
}

