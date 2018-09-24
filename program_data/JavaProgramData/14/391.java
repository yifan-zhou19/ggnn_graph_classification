package <missing>;

public class GlobalMembers
{
	/*
	 * xue sheng cheng ji tong ji.cpp
	 *
	 *  Created on: 2010-12-26
	 *      Author: taoshibo
	 */
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{ //??????????????
	//		int stuid;
	//		int chin;
	//		int math;
	//	}
	//	stu[n], t;
		for (i = 0; i < n; i++)
		{ //???? ???????
			stu[i].stuid = ConsoleInput.readToWhiteSpace(true);
			stu[i].chin = ConsoleInput.readToWhiteSpace(true);
			stu[i].math = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0; i < 3; i++) //?????
		{
			for (j = 0; j < n - 1; j++)
			{
				if ((stu[j].chin + stu[j].math) >= (stu[j + 1].chin + stu[j + 1].math))
				{
					t = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = t;
				}
			}
		}
		for (i = n - 1; i > n - 4; i--) //?????
		{
			System.out.print(stu[i].stuid);
			System.out.print(" ");
			System.out.print(stu[i].chin + stu[i].math);
			System.out.print("\n");
		}
		return 0;
	}

}

