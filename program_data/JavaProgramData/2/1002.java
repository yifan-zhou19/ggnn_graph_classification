package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char m = 0;
		int[] cnt = new int[255];
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int id;
	//		char au[32];
	//	}
	//	bk[1000];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(cnt, 0, (Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bk[i].au = tempVar3;
			}
			for (j = 0; bk[i].au[j]; j++)
			{
				if (++cnt[bk[i].au[j]] > cnt[m])
				{
					m = bk[i].au[j];
				}
			}
		}

		System.out.printf("%c\n%d\n", m, cnt[m]);
		for (i = 0; i < n; i++)
		{
			if (tangible.StringFunctions.strChr(bk[i].au, m))
			{
				System.out.printf("%d\n", bk[i].id);
			}
		}

	}

}

