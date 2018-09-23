package <missing>;

public class GlobalMembers
{
	/*
	 * structure_1.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: ???
	 *        ??? ????????
	 */



	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{ //?????????????????????
	//		int id;
	//		int cp;
	//		int mp;
	//		int tp;
	//	}
	//	stu[n],temp;
		for (i = 0;i < n;i++)
		{ //??????
			stu[i].id = ConsoleInput.readToWhiteSpace(true);
			stu[i].cp = ConsoleInput.readToWhiteSpace(true);
			stu[i].mp = ConsoleInput.readToWhiteSpace(true);
			stu[i].tp = stu[i].cp + stu[i].mp;
		}
		for (i = 0;i < 3;i++) //?????????
		{
			for (j = n - 1;j > i;j--)
			{
				if (stu[j].tp > stu[j - 1].tp)
				{
					temp = stu[j];
					stu[j] = stu[j - 1];
					stu[j - 1] = temp;
				}
			}
		}
		for (i = 0;i < 3;i++) //???????
		{
			System.out.print(stu[i].id);
			System.out.print(' ');
			System.out.print(stu[i].tp);
			System.out.print("\n");
		}
		return 0;
	}

}

