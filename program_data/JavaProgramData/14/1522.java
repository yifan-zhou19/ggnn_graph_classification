public class student
{
	public int no;
	public int yuwen;
	public int shuxue;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		student stu;
		student temp = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		stu = (student)calloc(n,sizeof(student));
		for (p = stu;p - stu < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.shuxue = Integer.parseInt(tempVar4);
			}
			p.total = p.yuwen + p.shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (p = stu + n - 1;p > stu + i;p--)
			{
				if (p.total > (p - 1).total)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*p;
					temp.copyFrom(p);
					*p = (p - 1);
					*(p - 1) = temp;
				}
			}
			System.out.printf("%d %d\n",p.no,p.total);
		}
		stu = null;
	}
}

