public class Student
{
	public int num;
	public int chn;
	public int mth;
	public int sum;
}
public class Scr
{
	public int num;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
		Scr[] scr = tangible.Arrays.initializeWithDefaultScrInstances(3);
		int n;
		int i;
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
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chn = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].mth = Integer.parseInt(tempVar4);
			}
			stu[i].sum = stu[i].chn + stu[i].mth;
		}
		scr[0].num = stu[0].num;
		scr[0].num = stu[0].num;
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum > scr[0].sum)
			{
				scr[0].num = stu[i].num;
				scr[0].sum = stu[i].sum;
			}
		}
		scr[1].num = stu[0].num;
		scr[1].num = stu[0].num;
		for (i = 1;i < n;i++)
		{
			if (i != scr[0].num - 1)
			{
				if (stu[i].sum > scr[1].sum)
				{
					scr[1].num = stu[i].num;
					scr[1].sum = stu[i].sum;
				}
			}
		}
		scr[2].num = stu[0].num;
		scr[2].num = stu[0].num;
		for (i = 1;i < n;i++)
		{
			if (i == scr[0].num - 1 || i == scr[1].num - 1)
			{
				continue;
			}
			else
			{
				if (stu[i].sum > scr[2].sum)
				{
					scr[2].num = stu[i].num;
					scr[2].sum = stu[i].sum;
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",scr[i].num,scr[i].sum);
		}
		return 0;
	}

}

