package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = n;
	while (i > 1)
	{
	if (i % 2 != 0)
	{
	System.out.printf("%d*3+1=%d\n",i,i * 3 + 1);
	i = i * 3 + 1;
	}
	if (i % 2 == 0)
	{
	System.out.printf("%d/2=%d\n",i,i / 2);
	i = i / 2;
	}
	}
	System.out.print("End");
	return 0;
	}

}

