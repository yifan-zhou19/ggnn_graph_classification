package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct bo
	//	{
	//		int a;
	//	char au[36];
	//	};
		bo[] bo = tangible.Arrays.initializeWithDefaultboInstances(999);
		int i;
		int j;
		char k;
		char K;
		int[] sb = new int[26];
		int sbt;
		int len;
		int n;
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
				bo[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bo[i].au = tempVar3;
			}
			len = String.valueOf(bo[i].au).length();
			for (j = 0;j < len;j++)
			{
				for (k = 65;k < 91;k++)
				{
					if (bo[i].au[j] == k)
					{
						sb[k - 65]++;
					}
				}
			}
		}
		K = 0;
		sbt = 0;
		for (i = 0;i < 26;i++)
		{
			if (sb[i] > sbt)
			{
				K = i + 65;
				sbt = sb[i];
			}
		}
		System.out.printf("%c\n%d\n",K,sbt);
		for (i = 0;i < m;i++)
		{
			n = 1;
			for (j = 0;j < String.valueOf(bo[i].au).length();j++)
			{
				if (K == bo[i].au[j])
				{
					n = 0;
				}
			}
			if (n == 0)
			{
				System.out.printf("%d\n",bo[i].a);
			}
		}



	}
}

