package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int c;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int x = 1;x <= n;x++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[] shuzu = new int[m];
	c = 0;
	for (int i = 0;i < m;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		shuzu[i] = Integer.parseInt(tempVar3);
	}
	if (c + shuzu[i] < 60)
	{
	if (c + shuzu[i] + 3 < 60)
	{
	c += 3;
	}
	else
	{
	c = 60 - shuzu[i];
	}
	}
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(shuzu);
	System.out.printf("%d\n",60 - c);
	}
	return 0;
	}

}

