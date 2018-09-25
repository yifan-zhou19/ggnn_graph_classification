public class Stu
{
	public int stuID;
	public int mark;
}

package <missing>;

public class GlobalMembers
{
	public static Stu[] stu = {0, null, null};

	public static int compare(Object p1, Object p2)
	{
		Stu a;
		Stu b;
		a = (Stu)p1;
		b = (Stu)p2;
		if (a.mark > b.mark)
		{
			return -1;
		}
		if (a.mark < b.mark)
		{
			return 1;
		}
		if (a.mark == b.mark)
		{
			return 0;
		}
	}



	public static void Main()
	{
		int n;
		int i;
		int ID;
		int chi;
		int math;
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
				ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			if (chi + math > stu[2].mark)
			{
				stu[2].mark = chi + math;
				stu[2].stuID = ID;
			}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			qsort(stu,3,sizeof(Stu),compare);
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].stuID,stu[i].mark);
		}
	}

}

