package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int max = 0;
	int seq = 0;
	int[] a = new int[26];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct book
	//{
	//int num;
	//char str[26];
	//}
	//book[999];

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
		book[i].str = tempVar3;
	}
	}

	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 26;j++)
		{
		a[(book[i].str[j] - 65)]++;
		}
	}

	for (i = 0;i < 26;i++)
	{
		if (a[i] > max)
		{
		max = a[i];
		seq = i;
		}
	}

	System.out.printf("%c\n",seq + 65);
	System.out.printf("%d\n",max);

	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 26;j++)
	{
	if (book[i].str[j] == seq + 65)
	{
		System.out.printf("%d\n",book[i].num);
		break;
	}
	}
	}


	}

}

