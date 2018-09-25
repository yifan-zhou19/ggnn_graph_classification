package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct SZ
	//	{
	//		char zfc[21];
	//	}
	//	sz[10000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].zfc = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;sz[i].zfc[j];j++)
			{
				if (!((sz[i].zfc[j] == '_') || (sz[i].zfc[j] >= 'A' && sz[i].zfc[j] <= 'Z') || (sz[i].zfc[j] >= 'a' && sz[i].zfc[j] <= 'z') || (sz[i].zfc[j] >= '0' && sz[i].zfc[j] <= '9' && j>0)))
				{
					break;
				}

			}
			System.out.print(sz[i].zfc[j]?"no\n":"yes\n");
		}
		return 0;
	}
}

