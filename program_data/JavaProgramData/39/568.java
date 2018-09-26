//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public String name = new String(new char[20]);
	public int qimo;
	public int banji;
	public char gb;
	public char xb;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] stu = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(101);

	public static void Main()
	{
		int N;
		int i;
		int max = 0;
		int p = 0;
		int total = 0;
		int[] sch = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (stu[i].qimo > 80 && stu[i].paper > 0)
			{
				sch[i] += 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banji > 80)
			{
				sch[i] += 4000;
			}
			if (stu[i].qimo > 90)
			{
				sch[i] += 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xb == 'Y')
			{
				sch[i] += 1000;
			}
			if (stu[i].banji > 80 && stu[i].gb == 'Y')
			{
				sch[i] += 850;
			}
		}
		max = 0;
		for (i = 0;i < N;i++)
		{
			if (sch[i] > max)
			{
				max = sch[i];
				p = i;
			}
			total = total + sch[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[p].name,sch[p],total);
	}

}

