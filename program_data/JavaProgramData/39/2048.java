package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int final;
	//		int eval;
	//		char leader;
	//		char west;
	//		int paper;
	//	}
	//	s;
		String maxname = new String(new char[20]);
		int n;
		int i;
		int j;
		int prize;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			prize = 0;
			for (j = 0;j < 20;j = j + 1)
			{
				s.name[j] = '\0';
			}
			s.final = 0;
			s.eval = 0;
			s.leader = '\0';
			s.west = '\0';
			s.paper = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s.final = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s.eval = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				s.leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				s.west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s.paper = tempVar7;
			}
			if (s.final > 80 && s.paper > 0)
			{
				prize = prize+8000;
			}
			if (s.final > 85 && s.eval > 80)
			{
				prize = prize+4000;
			}
			if (s.final > 90)
			{
				prize = prize+2000;
			}
			if (s.final > 85 && s.west == 'Y')
			{
				prize = prize+1000;
			}
			if (s.eval > 80 && s.leader == 'Y')
			{
				prize = prize+850;
			}
			sum = sum + prize;
			if (prize > max)
			{
				max = prize;
				for (j = 0;j < 20;j = j + 1)
				{
					maxname = tangible.StringFunctions.changeCharacter(maxname, j, '\0');
				}
				maxname = s.name;
			}
		}
		System.out.printf("%s\n",maxname);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);
	}
}

