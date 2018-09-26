package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int[] n = new int[100];
	int i;
	int[] m = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}

	for (i = 0;i < a;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(n[i]) = Integer.parseInt(tempVar2);
	}
	m[i] = 0;
	}
	for (int j = 0;j < a;j++)
	{
	for (i = j + 1;i < a;i++)
	{
	if (n[j] == n[i])
	{
		m[i]++;
	}
	}
	}
	System.out.printf("%d",n[0]);
	for (i = 1;i < a;i++)
	{
	if (m[i] == 0)
	{
		System.out.printf(",%d",n[i]);
	}
	}
	return 0;
	}

}

