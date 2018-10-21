package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct
	//{
	//	int num;
	//	char author[26];
	//}
	//book[1000];
	int[] shu_num = new int[26];
	int i;
	int j;
	int k;
	int n;
	int max;
	int length;
	char max_author;
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
		book[i].num = tempVar2;
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		book[i].author = tempVar3;
	}
	}
	for (k = 0;k < 26;k++)
	{
		shu_num[k] = 0;
	}
	for (k = 0;k < 26;k++)
	{
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(book[i].author).length();
			for (j = 0;j < length;j++)
			{
				if (book[i].author[j] == 'A' + k)
				{
					shu_num[k]++;
				}
			}
		}
	}
	max = shu_num[0];
	max_author = 'A';
	for (k = 0;k < 26;k++)
	{
		if (shu_num[k] > max)
		{
		max = shu_num[k];
		max_author = 'A' + k;
		}
	}
	System.out.printf("%c\n%d\n",max_author,max);
	for (i = 0;i < n;i++)
	{
		length = String.valueOf(book[i].author).length();
		for (j = 0;j < length;j++)
		{
			if (book[i].author[j] == max_author)
			{
			System.out.printf("%d\n",book[i].num);
			}
		}
	}
		return 0;
	}
}

