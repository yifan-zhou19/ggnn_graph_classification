package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int m;
	int k;
	int[] str = new int[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str[i] = Integer.parseInt(tempVar2);
	}
	}
	System.out.print("\n");
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (j = 0;str[j] == k;j++)
	{
		;
	}
	System.out.printf("%d",str[j]);
	for (j = j + 1;j < m;j++)
	{
	if (str[j] != k)
	{
		System.out.printf(" %d",str[j]);
	}
	}
	}
}

