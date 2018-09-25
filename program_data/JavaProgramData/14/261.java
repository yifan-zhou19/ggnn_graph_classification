public class student
{
	public int num;
	public int yw;
	public int sx;
	public int zong;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);

	public static void Main(String[] args)
	{
		int i;
		int n;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int fir;
		int sec;
		int thi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yw = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].sx = Integer.parseInt(tempVar4);
			}
			stu[i].zong = stu[i].yw + stu[i].sx;
			if (stu[i].zong > max1)
			{
				max3 = max2;
				thi = sec;
				max2 = max1;
				sec = fir;
				max1 = stu[i].zong;
				fir = i;
			}
			else if (stu[i].zong > max2)
			{
				max3 = max2;
				thi = sec;
				max2 = stu[i].zong;
				sec = i;
			}
			else if (stu[i].zong > max3)
			{
				max3 = stu[i].zong;
				thi = i;
			}
		}

		System.out.printf("%d %d\n",stu[fir].num,stu[fir].zong);
		System.out.printf("%d %d\n",stu[sec].num,stu[sec].zong);
		System.out.printf("%d %d\n",stu[thi].num,stu[thi].zong);
	}


}

