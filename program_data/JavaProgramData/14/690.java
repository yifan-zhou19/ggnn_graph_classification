public class student
{
	public int stuID;
	public int yuwen;
	public int shuxue;
	public int zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int i;
		int n;
		int j;
		int x;
		int str;
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
				stu[i].stuID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			stu[i].zongfen = stu[i].yuwen + stu[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (stu[j].zongfen > stu[j + 1].zongfen || ((stu[j].zongfen == stu[j + 1].zongfen) && (stu[j].stuID < stu[j + 1].stuID)))
				{
					x = stu[j].zongfen;
					stu[j].zongfen = stu[j + 1].zongfen;
					stu[j + 1].zongfen = x;
					str = stu[j].stuID;
					stu[j].stuID = stu[j + 1].stuID;
					stu[j + 1].stuID = str;
				}
			}
				System.out.printf("%d %d\n",stu[n - 1 - i].stuID,stu[n - 1 - i].zongfen);
		}
		return 0;
	}


}

