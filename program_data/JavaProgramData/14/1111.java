public class student
{
	public int num;
	public float yuwen;
	public float shuxue;
	public float total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int i;
		int n;
		int j;
		student p;
		p = stu[0];
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
				(p + i).num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p + i).yuwen = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(p + i).shuxue = Float.parseFloat(tempVar4);
			}
			(p + i).total = (p + i).shuxue + (p + i).yuwen;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if ((*(p + j)).total >= (*(p + j + 1)).total)
				{
					student temp = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*(p+j+1);
					temp.copyFrom((p + j + 1));
					*(p + j + 1) = *(p + j);
					*(p + j) = temp;
				}
			}
		}
		if (n > 2)
		{
			for (i = 1;i < 4;i++)
			{
				System.out.printf("%d %g\n",(*(p + n - i)).num,(*(p + n - i)).total);
			}
		}
		else if (n = 2)
		{
			System.out.printf("%d %g\n%d %g\n",(*(p + 1)).num,(*(p + 1)).total, p.num, p.total);
		}
	}

}

