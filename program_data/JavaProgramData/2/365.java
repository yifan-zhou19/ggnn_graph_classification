package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char name[26];
	//	};
		int n;
		int i;
		int j;
		int[] a = new int[26];
		int[] len = new int[1000];
		int k;
		int max = 0;
		book[] list = tangible.Arrays.initializeWithDefaultbookInstances(1000);
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
				list[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				list[i].name = tempVar3;
			}
			len[i] = String.valueOf(list[i].name).length();
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < len[j];k++)
				{
					if (list[j].name[k] == i + 65)
					{
						a[i]++;
						break;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				k = i;
			}
		}
		System.out.printf("%c\n",k + 65);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (list[i].name[j] == k + 65)
				{
					System.out.printf("%d\n",list[i].num);
				}
			}
		}
		return 0;
	}
}

