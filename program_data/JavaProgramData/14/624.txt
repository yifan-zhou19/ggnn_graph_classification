package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student_Num //?????
	//	{
	//		int num; //??
	//		int Chinese; //????
	//		int Math; //????
	//	};
		Student_Num[] student = tangible.Arrays.initializeWithDefaultStudent_NumInstances(N); //N??????
		Student_Num temp = new Student_Num();
		for (i = 0;i < N;i++)
		{
			student[i].num = ConsoleInput.readToWhiteSpace(true);
			student[i].Chinese = ConsoleInput.readToWhiteSpace(true);
			student[i].Math = ConsoleInput.readToWhiteSpace(true);
		}
		int[] total = new int[N]; //?????????????????????????
		int[] totalNum = new int[3];
		int[] p = new int[3];
		for (i = 0;i < N;i++)
		{
			total[i] = student[i].Chinese + student[i].Math; //???
		}
		for (i = 0;i < 3;i++) //????0
		{
			totalNum[i] = 0;
		}
		for (i = 0;i < 3;i++) //?????
		{
			for (j = 0;j < N;j++)
			{
				if (totalNum[i] < total[j])
				{
					totalNum[i] = total[j];
					p[i] = j;
				}
			}
			total[p[i]] = 0; //?????????????????0???????????????
		}
		for (i = 0;i < 3;i++)
		{
			System.out.print(student[p[i]].num);
			System.out.print(' ');
			System.out.print(totalNum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

