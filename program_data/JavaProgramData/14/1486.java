package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int xh;
	//		int yw;
	//		int sx;
	//		int zf;
	//	}
	//	data[100000];
		int n;
		int i;
		int max;
		int x;
		int j;
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
				data[i].xh = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				data[i].yw = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				data[i].sx = tempVar4;
			}
			data[i].zf = data[i].yw + data[i].sx;
		}
		for (i = 0;i < 3;i++)
		{
			max = data[0].zf;
			x = 0;
			for (j = 1;j < n;j++)
			{
				if (data[j].zf > max)
				{
					max = data[j].zf;
					x = j;
				}
			}
			System.out.printf("%d %d\n",data[x].xh,data[x].zf);
			data[x].zf = 0;

		}
	}


}

