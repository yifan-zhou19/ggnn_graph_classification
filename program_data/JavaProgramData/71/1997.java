package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int s;
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int y,m1,m2;
	//	}
	//	an[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;


		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				an[i].y = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				an[i].m1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				an[i].m2 = tempVar4;
			}
			if ((an[i].y % 4 == 0 && an[i].y % 100 != 0) || (an[i].y % 400 == 0))
			{
				b[2] = 29;
			}
			else
			{
				b[2] = 28;
			}
			if (an[i].m2 < an[i].m1)
			{
				t = an[i].m1;
				an[i].m1 = an[i].m2;
				an[i].m2 = t;
			}

			for (j = an[i].m1;j < an[i].m2;j++)
			{

				s = s + b[j];
			}
			if (s % 7 == 0)
			{
				System.out.print("YES\n");
			}
			if (s % 7 != 0)
			{
				System.out.print("NO\n");
			}
			s = 0;
		}

		return 0;
	}

}

