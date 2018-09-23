package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] len = new int[1000];
		int[] sum = new int[26];
		int max;
		int i;
		int j;
		int i0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char wri[27];
	//	}
	//	book[1000];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].wri = tempVar3;
			}
			len[i] = String.valueOf(book[i].wri).length();
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				sum[book[i].wri[j] - 65]++;
			}
		}
		max = sum[0];
		i0 = 0;
		for (i = 1;i < 26;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				i0 = i;
			}
		}
		System.out.printf("%c\n",i0 + 65);
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (book[i].wri[j] == 65 + i0)
				{
					System.out.printf("%d\n",book[i].num);
					break;
				}
			}
		}
		return 0;
	}
}

