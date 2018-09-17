package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		int i;
		int j;
		int N;
		int[] anNum = new int[MAX];
		int[] anFlag = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(anFlag,1,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				anNum[i] = Integer.parseInt(tempVar2);
			}
			anFlag[i] = 1;
		}
		for (i = N - 2;i >= 0;i--)
		{
			int Max = 0;
			for (j = i + 1;j < N;j++)
			{
				if (anNum[i] >= anNum[j])
				{
					if (anFlag[j] > Max)
					{
						Max = anFlag[j];
					}
				}
			}
			anFlag[i] = Max + 1;
		}
		int Max = 0;
		for (i = 0;i < N;i++)
		{
			if (anFlag[i] > Max)
			{
				Max = anFlag[i];
			}
		}
		System.out.printf("%d\n",Max);
		return 0;
	}

}

