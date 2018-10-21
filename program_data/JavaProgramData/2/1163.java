package <missing>;

public class GlobalMembers
{
	public static int max(int[] array)
	{
		int i;
		int max = 0;
		for (i = 0;i < 26;i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max == array[i])
			{
				break;
			}
		}
		return i;
	}
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char aut[26];
	//	};
		int a;
		int i;
		int j;
		int m;
		int k;
		int[] t = new int[26];
		book[] nbook = tangible.Arrays.initializeWithDefaultbookInstances(999);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nbook[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				nbook[i].aut = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (nbook[i].aut[j] == k + 65)
					{
						t[k]++;
					}
				}
			}
		}
		a = max(t);
		System.out.printf("%c\n%d\n",a + 65,t[a]);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (nbook[i].aut[j] == a + 65)
				{
					System.out.printf("%d\n",nbook[i].num);
				}
			}
		}
	}
}

