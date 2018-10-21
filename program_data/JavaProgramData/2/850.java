package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct books
	//{
	//int num;
	//char author[26];
	//}
	//books[999];
	int n;
	int[] a = new int[26];
	int max;
	int i;
	int j;
	int u;
	int lenth;
	int temp;
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
		books[i].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		books[i].author = tempVar3;
	}
	}
	for (i = 0;i < n;i++)
	{
	lenth = String.valueOf(books[i].author).length();
	for (j = 0;j < lenth;j++)
	{
	for (u = 0;u < 26;u++)
	{
	if (books[i].author[j] == 'A' + u)
	{
	a[u]++;
	}
	}
	}
	}
	temp = a[0];
	for (u = 0;u < 26;u++)
	{
	if (a[u] >= temp)
	{
	max = u;
	temp = a[u];
	}
	}
	System.out.printf("%c\n%d\n",'A' + max,a[max]);
	for (i = 0;i < n;i++)
	{
	lenth = String.valueOf(books[i].author).length();
	for (j = 0;j < lenth;j++)
	{
	if (books[i].author[j] == 'A' + max)
	{
	System.out.printf("%d\n",books[i].num);
	}
	}
	}
	}


}

