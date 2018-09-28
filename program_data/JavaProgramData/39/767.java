package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int smax = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		char name[21];
	//		int qimo;
	//		int banji;
	//		char bangan;
	//		char xibu;
	//		int lunwen;
	//		int sum;
	//	}
	//	s[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[i].sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].banji = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].bangan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].lunwen = tempVar7;
			}
		}
			for (i = 0;i < n;i++)
			{
			if ((s[i].qimo > 80) && (s[i].lunwen > 0))
			{
				s[i].sum = s[i].sum + 8000;
			}
			if ((s[i].qimo > 85) && (s[i].banji > 80))
			{
				s[i].sum = s[i].sum + 4000;
			}
			if (s[i].qimo > 90)
			{
				s[i].sum = s[i].sum + 2000;
			}
			if ((s[i].qimo > 85) && (s[i].xibu == 'Y'))
			{
				s[i].sum = s[i].sum + 1000;
			}
			if ((s[i].banji > 80) && (s[i].bangan == 'Y'))
			{
				s[i].sum = s[i].sum + 850;
			}
			}
			for (i = 0;i < n;i++)
			{
				smax += s[i].sum;
				if (s[i].sum > s[0].sum)
				{
					s[0].sum = s[i].sum;
				s[0] = s[i];
				}
			}
			System.out.printf("%s\n",s[0].name);
			System.out.printf("%d\n",s[0].sum);
			System.out.printf("%d",smax);
			return 0;
	}

}

