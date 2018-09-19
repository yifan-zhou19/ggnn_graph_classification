package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tushu
	//	{
	//		int bianhao;
	//		char zuozhe[26];
	//	};
		int i;
		int j;
		int n;
		int q = 0;
		int[] count = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		tushu pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (tushu)malloc(sizeof(tushu) * n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *m;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				((pp + i).bianhao) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(pp + i).zuozhe = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			m[i] = String.valueOf(pp[i].zuozhe).length();
			for (j = 0;j < m[i];j++)
			{
				count[pp[i].zuozhe[j] - 'A']++;
			}
		}
		int max = 0;
		for (i = 0;i < 26;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				q = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + q,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m[i];j++)
			{
				if (pp[i].zuozhe[j] == ('A' + q))
				{
					System.out.printf("%d\n",pp[i].bianhao);
				}
			}
		}

		return 0;
	}




}

