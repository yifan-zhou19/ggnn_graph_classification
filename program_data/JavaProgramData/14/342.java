package <missing>;

public class GlobalMembers
{
	/*
	 * jiegou_1.cpp
	 *
	 *  Created on: 2011-1-2
	 *      Author: Iris
	 *      ????????
	 * ????STUDENT_NUM????????�????�???? ?????????ID???????????
	 * ???????????????????????????????
	 */


	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int stuNo;
	//		int yuwen;
	//		int shuxue;
	//		int zongfen;
	//	}
		stu[n]; //?????????????????????????t?????
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct tri
	//	{
	//		int stuNo;
	//		int zongfen;
	//	}
		qian[3] = {0,0,0,0,0,0}; //??????????????????????
		for (i = 0;i < n;i++)
		{
			stu[i].stuNo = ConsoleInput.readToWhiteSpace(true);
			stu[i].yuwen = ConsoleInput.readToWhiteSpace(true);
			stu[i].shuxue = ConsoleInput.readToWhiteSpace(true);
			stu[i].zongfen = stu[i].yuwen + stu[i].shuxue; //?????????
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].zongfen > qian[0].zongfen)
			{
				qian[2] = qian[1];
				qian[1] = qian[0];
				qian[0].stuNo = stu[i].stuNo;
				qian[0].zongfen = stu[i].zongfen;
				continue;
			}
			if (stu[i].zongfen > qian[1].zongfen)
			{
				qian[2] = qian[1];
				qian[1].stuNo = stu[i].stuNo;
				qian[1].zongfen = stu[i].zongfen;
				continue;
			}
			if (stu[i].zongfen > qian[2].zongfen)
			{
				qian[2].stuNo = stu[i].stuNo;
				qian[2].zongfen = stu[i].zongfen;
			}
		} //?????
		for (i = 0;i < 3;i++)
		{
			System.out.print(qian[i].stuNo);
			System.out.print(' ');
			System.out.print(qian[i].zongfen);
			System.out.print("\n");
		}
		return 0;
	}

}

