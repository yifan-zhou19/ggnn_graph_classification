package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct person
	//	{
	//		char sex[6];
	//		double height;
	//	}
	//	person[40];
		int n;
		int i;
		int j;
		int mk = 0;
		int fk = 0;
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
				person[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(person[i].height) = tempVar3;
			}
		}
		double[] male = new double[40];
		double[] female = new double[40];
		for (i = 0;i < n;i++)
		{
			if (strcmp(person[i].sex,"male") == 0)
			{
				male[mk] = person[i].height;
				mk++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(person[i].sex,"female") == 0)
			{
				female[fk] = person[i].height;
				fk++;
			}
		}
		for (i = 0;i < mk;i++)
		{
			for (j = mk - 1;j > 0;j--)
			{
				if (male[j - 1] > male[j])
				{
					double p;
					p = male[j];
					male[j] = male[j - 1];
					male[j - 1] = p;
				}
			}
		}
		for (i = 0;i < fk;i++)
		{
			for (j = fk - 1;j > 0;j--)
			{
				if (female[j - 1] < female[j])
				{
					double p;
					p = female[j];
					female[j] = female[j - 1];
					female[j - 1] = p;
				}
			}
		}
		for (i = 0;i < mk;i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",male[i]);
			}
			else
			{
				System.out.printf(" %.2lf",male[i]);
			}
		}
		for (i = 0;i < fk;i++)
		{
			System.out.printf(" %.2lf",female[i]);
		}
		return 0;
	}
}

