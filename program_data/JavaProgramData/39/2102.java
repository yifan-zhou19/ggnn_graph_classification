public class student
{
	public String mz = new String(new char[20]);
	public int cj;
	public int py;
	public char gb;
	public char xb;
	public int lw;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int max;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		student stu = (student)malloc(sizeof(student) * N); //??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		for (i = 0;i < N;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.mz = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p.cj) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p.py) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(p.gb) = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(p.xb) = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(p.lw) = Integer.parseInt(tempVar7);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		for (i = 0;i < N;i++,p++)
		{
			(p.money) = 0;
			if (p.cj > 80 && p.lw > 0)
			{
				(p.money) += 8000;
			}
			if (p.cj > 85 && p.py > 80)
			{
				(p.money) += 4000;
			}
			if (p.cj > 90)
			{
				(p.money) += 2000;
			}
			if (p.cj > 85 && p.xb == 'Y')
			{
				(p.money) += 1000;
			}
			if (p.py > 80 && p.gb == 'Y')
			{
				(p.money) += 850;
			}
		} //?????
		sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=stu;
		p.copyFrom(stu);
		for (i = 0;i < N;i++,p++)
		{
			sum += (p.money);
		} //?????
		max = 0;
		for (i = 0;i < N;i++)
		{
			if (stu[i].money > stu[max].money)
			{
				max = i;
			}
		} //?????
		System.out.printf("%s\n%d\n%d\n",stu[max].mz,stu[max].money,sum);
		stu = null;
		return 0;
	}

}

