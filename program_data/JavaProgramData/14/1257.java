package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct test
	//	{
	//		int ID,chinese,maths,sum;
	//	}
	//	ss[100000];
		int i;
		int n;
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
				ss[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ss[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ss[i].maths = tempVar4;
			}
			ss[i].sum = ss[i].chinese + ss[i].maths;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct score
	//	{
	//		int ID,sum;
	//	}
	//	s[5];
		s[1].sum = 0;
		s[2].sum = 0;
		s[3].sum = 0;
		for (i = 0;i <= n;i++)
		{
			if (ss[i].sum > s[1].sum)
			{
				s[3].ID = s[2].ID;
				s[3].sum = s[2].sum;
				s[2].ID = s[1].ID;
				s[2].sum = s[1].sum;
				s[1].ID = ss[i].ID;
				s[1].sum = ss[i].sum;
			}
			else if (ss[i].sum > s[2].sum)
			{
				s[3].ID = s[2].ID;
				s[3].sum = s[2].sum;
				s[2].ID = ss[i].ID;
				s[2].sum = ss[i].sum;
			}
			else if (ss[i].sum > s[3].sum)
			{
				s[3].ID = ss[i].ID;
				s[3].sum = ss[i].sum;
			}
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.printf("%d %d\n",s[i].ID,s[i].sum);
		}
	}


}

