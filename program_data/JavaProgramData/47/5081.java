package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] shuzu = new int[n];
	int[] Shuzu = new int[n];
	for (int k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shuzu[k] = Integer.parseInt(tempVar2);
	}
	}
	for (int i = 0;i < n;i++)
	{
	Shuzu[i] = shuzu[n - 1 - i];
	}
	for (int r = 0;r < n - 1;r++)
	{
	System.out.printf("%d ",Shuzu[r]);
	}
	System.out.printf("%d",Shuzu[n - 1]);
	return 0;
	}




}

