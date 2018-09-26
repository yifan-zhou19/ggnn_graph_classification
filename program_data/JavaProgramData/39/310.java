package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct f
	//	{
	//		char str[21];
	//		int score1,score2,article; //score1???????? score2??????
	//		char a,b;
	//		int prize;
	//	}
	//	*p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (f)malloc(n * sizeof(f));
		for (i = 0;i < n;i++)
		{
			(p + i).prize = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).str = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				((p + i).score1) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				((p + i).score2) = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				((p + i).a) = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				((p + i).b) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				((p + i).article) = tempVar7;
			}
		if ((p + i).score1 > 80 && (p + i).article > 0)
		{
			(p + i).prize += 8000;
		}
		if ((p + i).score1 > 85 && (p + i).score2 > 80)
		{
			(p + i).prize += 4000;
		}
		if ((p + i).score1 > 90)
		{
			(p + i).prize += 2000;
		}
		if ((p + i).score1 > 85 && (p + i).b == 'Y')
		{
			(p + i).prize += 1000;
		}
		if ((p + i).score2 > 80 && (p + i).a == 'Y')
		{
			(p + i).prize += 850;
		}
		}
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += (p + i).prize;
		}
		String p1;
		int max = 0;
		for (i = 0;i < n;i++) //????????????max?
		{
			if ((p + i).prize > max)
			{
				max = (p + i).prize;
				p1 = (p + i).str;
			}
		}
			System.out.printf("%s\n%d\n%ld",p1,max,sum);
	}

}

