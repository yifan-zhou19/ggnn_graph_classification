package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[999];
	int m;
	int i;
	int j;
	int[] c = new int[26];
	int max = 0;
	int d;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (k = 0;k < 26;k++)
	{
	c[k] = 0;
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct books
	//{
	//int num;
	//char name[26];
	//}
	//books[999];
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		books[i].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		books[i].name = tempVar3;
	}
	}
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < String.valueOf(books[i].name).length();j++)
	{
	c[books[i].name[j] - 'A']++;
	}
	}
	for (k = 0;k < 26;k++)
	{
	if (c[k] > max)
	{
		max = c[k];
		d = k;
	}
	}
	System.out.printf("%c\n%d\n",d + 'A',max);

	for (i = 0;i < m;i++)
	{
	for (j = 0;j < String.valueOf(books[i].name).length();j++)
	{
	if (books[i].name[j] == d + 'A')
	{
		System.out.printf("%d\n",books[i].num);
		break;
	}
	}
	}
	}
}

