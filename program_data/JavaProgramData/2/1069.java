package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int len;
	int i;
	int j;
	int k;
	int max;
	int[] c = new int[26];
	String a = new String(new char[26]);
	char f;
	char x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct book
	//{
	//	int num;
	//	char author[26];
	//};
	book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[i].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i].author = tempVar3;
	}
	}
	for (i = 0;i < n;i++)
	{
		a = b[i].author;
	len = a.length();
	for (j = 0;j < len;j++)
	{
	if ('A' <= (x = a.charAt(j)) && (x = a.charAt(j)) <= 'Z')
	{
	c[x - 'A']++;
	}
	}
	}
	max = c[0];
	k = 0;
	for (i = 0;i < 26;i++)
	{
		if (c[i] > max)
		{
		max = c[i];
	k = i;
		}
	}
	System.out.printf("%c\n%d\n",k + 'A',max);
	for (i = 0;i < n;i++)
	{
	a = b[i].author;
	len = a.length();
	for (j = 0;j < len;j++)
	{
	if ((f = a.charAt(j)) == k + 'A')
	{
	System.out.printf("%d\n",b[i].num);
	}
	}

	}




	}
}

