package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct z
	//	{
	//		int op,ed;
	//	}
	//	z[10000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[i].op = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i].ed = tempVar3;
			}
		}
		int j;
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (z[j + 1].op < z[j].op)
				{
					z[n + 1] = z[j];
					z[j] = z[j + 1];
					z[j + 1] = z[n + 1];
				}
			}
		}
		int o = 0;
		for (i = 1;i < n;i++)
		{
			if (z[0].ed >= z[i].op)
			{
				o++;
				if (z[0].ed <= z[i].ed)
				{
					z[0].ed = z[i].ed;
				}
			}
		}
		if (o == n - 1)
		{
			System.out.printf("%d %d",z[0].op,z[0].ed);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

