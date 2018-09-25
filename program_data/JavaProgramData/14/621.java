package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{ //????student
	//		int StudentNumber; //??
	//		int ChineseGrades; //????
	//		int MathGrades; //????
	//		int Total; //???
	//	};
		student[] Stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000); //??????Stu?sTemp
		student sTemp = new student();
		int n; //n??????i?j?????
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{ //????????????????????????
			Stu[i].StudentNumber = ConsoleInput.readToWhiteSpace(true);
			Stu[i].ChineseGrades = ConsoleInput.readToWhiteSpace(true);
			Stu[i].MathGrades = ConsoleInput.readToWhiteSpace(true);
			Stu[i].Total = Stu[i].ChineseGrades + Stu[i].MathGrades;
		}
		for (i = 0;i <= 2;i++)
		{ //?????????????????????
			for (j = n - 1;j >= i + 1;j--)
			{
				if (Stu[j].Total > Stu[j - 1].Total)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: sTemp=Stu[j];
					sTemp.copyFrom(Stu[j]);
					Stu[j] = Stu[j - 1];
					Stu[j - 1] = sTemp;
				}
			}
		}
		System.out.print(Stu[0].StudentNumber);
		System.out.print(" ");
		System.out.print(Stu[0].Total);
		for (i = 1;i <= 2;i++)
		{
			System.out.print("\n");
			System.out.print(Stu[i].StudentNumber);
			System.out.print(" ");
			System.out.print(Stu[i].Total);
		}
		return 0;
	}

}

