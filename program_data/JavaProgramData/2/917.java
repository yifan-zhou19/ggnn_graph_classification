package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//{
	//	int m;
	//char au[26];
	//}
	//b[999];
	int m;
	int[] n = new int[26];
	int M = 0;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 26;i++)
	{
	n[i] = 0;
	}
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i].m = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i].au = tempVar3;
	}
	}
	for (i = 0;i < m;i++)
	{
	for (j = 0;b[i].au[j] != '\0';j++)
	{
	n[b[i].au[j] - 65]++;
	}
	}
	for (i = 1;i < 26;i++)
	{
	if (n[M] < n[i])
	{
		M = i;
	}
	}
	System.out.printf("%c\n%d",M + 65,n[M]);
	for (i = 0;i < m;i++)
	{
	for (j = 0;b[i].au[j] != '\0';j++)
	{
	if (b[i].au[j] == M + 65)
	{
		System.out.printf("\n%d",b[i].m);
	}
	}
	}
	return 0;
	}

}

