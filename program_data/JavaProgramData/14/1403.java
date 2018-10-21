package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct grades
	//	{
	//		int id;
	//		int yuwen,shuxue;
	//		int zongfen;
	//	}
	//	grades[100007];
		int i;
		int n;
		int j;
		int t;
		int s;
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
				grades[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				grades[i].yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				grades[i].shuxue = tempVar4;
			}

			grades[i].zongfen = grades[i].yuwen + grades[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (grades[j].zongfen >= grades[j + 1].zongfen)
				{
					t = grades[j].zongfen;
					grades[j].zongfen = grades[j + 1].zongfen;
					grades[j + 1].zongfen = t;
					s = grades[j].id;
					grades[j].id = grades[j + 1].id;
					grades[j + 1].id = s;
				}
			}
		}
		for (i = n - 1;i >= n - 3;i--)
		{
			System.out.printf("%d %d\n",grades[i].id,grades[i].zongfen);
		}

	}
}

