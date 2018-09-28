package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//	   int fen;
	//	   int ban;
	//	   char gan[1];
	//	   char xi[1];
	//	   int wen;
	//	}
	//	s[100];
		int n;
		int i;
		int j;
		int money = 0;
		int mon = 0;
		int mona = 0;
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
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].fen = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].ban = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				s[i].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				s[i].xi = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i].wen = tempVar7;
			}
			if (s[i].fen > 80 && s[i].wen >= 1)
			{
				money = money + 8000;
			}
			if (s[i].fen > 85 && s[i].ban > 80)
			{
				money = money + 4000;
			}
			if (s[i].fen > 90)
			{
				money = money + 2000;
			}
			if (s[i].fen > 85 && s[i].xi[0] == 'Y')
			{
				money = money + 1000;
			}
			if (s[i].ban > 80 && s[i].gan[0] == 'Y')
			{
				money = money + 850;
			}
			if (money > mon)
			{
				mon = money;
				j = i;
			}
			mona = mona + money;
			money = 0;
		}
			System.out.printf("%s\n",s[j].name);
			System.out.printf("%d\n",mon);
			System.out.printf("%d\n",mona);
	}

}

