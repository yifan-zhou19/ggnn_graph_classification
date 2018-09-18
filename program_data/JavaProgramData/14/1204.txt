public class student
	{
	public int xuehao;
	public int shuxue;
	public int yuwen;
	public int zongfen;
	}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int e;
			int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].xuehao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar4);
			}
			stu[i].zongfen = stu[i].shuxue + stu[i].yuwen;
		}
		for (i = 1;i < 4;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (stu[j].zongfen >= stu[j + 1].zongfen)
				{
					stu[100000] = stu[j + 1];
					stu[j + 1] = stu[j];
					stu[j] = stu[100000];
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
		   System.out.printf("%d %d\n", stu[i].xuehao,stu[i].zongfen);
		}







		return 0;
	}
}

