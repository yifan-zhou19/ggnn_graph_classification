package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int j;
		int k;
		int z;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student
	//	{
	//	   int num;
	//	   int yuwen;
	//	   int shuxue;
	//	   int zongfen;
	//	}
	//	stu[n];


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yuwen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].shuxue = tempVar4;
			}
			stu[i].zongfen = stu[i].yuwen + stu[i].shuxue;
		}

		for (j = 0;j < 3;j++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (stu[k].zongfen > stu[k + 1].zongfen)
				{
				   z = stu[k + 1].zongfen;
				   stu[k + 1].zongfen = stu[k].zongfen;
				   stu[k].zongfen = z;
				   x = stu[k + 1].num;
				   stu[k + 1].num = stu[k].num;
				   stu[k].num = x;
				}
				else if (stu[k].zongfen == stu[k + 1].zongfen && stu[k].num < stu[k + 1].num)
				{
				   z = stu[k + 1].zongfen;
				   stu[k + 1].zongfen = stu[k].zongfen;
				   stu[k].zongfen = z;
				   x = stu[k + 1].num;
				   stu[k + 1].num = stu[k].num;
				   stu[k].num = x;
				}
				else
				{
					;
				}
			}
		}

		for (j = 0;j < 3;j++)
		{
			System.out.printf("%d %d\n",stu[n - 1 - j].num,stu[n - 1 - j].zongfen);
		}


		System.in.read();
		System.in.read();





	}

}

