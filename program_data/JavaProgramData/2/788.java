package <missing>;

public class GlobalMembers
{
	public static int ismax(int[] l, int a)
	{
		int i;
		for (i = 0;i < 26;i++)
		{
			if (l[i] > l[a])
			{
				return (0);
			}
		}
		return (1);
	}

	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int p;
		int[] l = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct shu
	//	{
	//		int num;
	//		char auth[100];
	//	}
	//	book[999];
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
				book[i].auth = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < 100;k++)
				{
					if (book[j].auth[k] == i + 65)
					{
						l[i]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (ismax(l, i) == 1)
			{
				System.out.printf("%c\n%d\n",i + 65,l[i]);
				p = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (book[i].auth[j] == p + 65)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
	}
}

