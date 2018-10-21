public class student
	{
	public int count;
	public int yu;
	public int shu;
	}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000000);
	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int max = 0;
		int sm = 0;
		int tm = 0;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(1000000 * (Integer.SIZE / Byte.SIZE));
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
				stu[i].count = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yu = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shu = Integer.parseInt(tempVar4);
			}
			*(p + i) = stu[i].yu + stu[i].shu;
		}
			for (i = 0;i < n;i++)
			{
			max = (max > *(p + i))?max:(*(p + i));
			}
			for (i = 0;i < n;i++)
			{
				if ((*(p + i) < max) && (*(p + i)> sm))
				{
			sm = (p + i);
				}
			}
			for (i = 0;i < n;i++)
			{
				if ((*(p + i) > tm) && (*(p + i) < sm))
				{
			tm = (p + i);
				}
			}

		for (i = 0;j < 3,i < n;i++)
		{
		if (*(p + i) == max)
		{
			System.out.printf("%d %d\n",stu[i].count,max);
		j++;
		}
		}

		for (i = 0;j < 3,i < n;i++)
		{
			if (*(p + i) == sm && j < 3)
			{
			System.out.printf("%d %d\n",stu[i].count,sm);
			j++;
			}
		}
		for (i = 0;j < 3,i < n;i++)
		{
				if (*(p + i) == tm && j < 3)
				{
					System.out.printf("%d %d\n",stu[i].count,tm);
				j++;
				}
		}
	}
}

