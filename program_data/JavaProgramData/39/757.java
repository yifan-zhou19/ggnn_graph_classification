package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char name[21];
	// int term,cla;
	// char lead,west;
	// int dis,sum;
	//}
	//s,s1;
	 int n;
	 int i;
	 int[] money = new int[5];
	 int total;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 s1.sum = -1;
	 total = 0;
	 for (i = 0;i < n;i++)
	 {
		 money[0] = money[1] = money[2] = money[3] = money[4] = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s.name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s.term = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			s.cla = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			s.lead = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			s.west = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			s.dis = tempVar7;
		}
		if (s.term > 80 && s.dis > 0)
		{
			money[0] = 8000;
		}
		if (s.term > 85 && s.cla > 80)
		{
			money[1] = 4000;
		}
		if (s.term > 90)
		{
			money[2] = 2000;
		}
		if (s.term > 85 && s.west == 'Y')
		{
			money[3] = 1000;
		}
		if (s.cla > 80 && s.lead == 'Y')
		{
			money[4] = 850;
		}
		s.sum = money[0] + money[1] + money[2] + money[3] + money[4];
		total += s.sum;
		if (s.sum > s1.sum)
		{
			s1 = s;
		}
	 }
		 System.out.printf("%s\n%d\n%d\n",s1.name,s1.sum,total);
	}

}

