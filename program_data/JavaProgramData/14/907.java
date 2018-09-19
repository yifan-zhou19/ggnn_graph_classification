public class student
{
	public int ID;
	public int yuwen;
	public int shuxue;
	public int zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].ID = Integer.parseInt(tempVar2);
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
		for (i = 1;i < 4;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (stu[j].zongfen >= stu[j + 1].zongfen)
				{
					e = stu[j].zongfen;
					stu[j].zongfen = stu[j + 1].zongfen;
					stu[j + 1].zongfen = e;
					e = stu[j].ID;
					stu[j].ID = stu[j + 1].ID;
					stu[j + 1].ID = e;
				}
			}
		}

		System.out.printf("%d %d\n%d %d\n%d %d\n",stu[n - 1].ID,stu[n - 1].zongfen,stu[n - 2].ID,stu[n - 2].zongfen,stu[n - 3].ID,stu[n - 3].zongfen);
		return 0;
	}


}

