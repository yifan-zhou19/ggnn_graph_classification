package <missing>;

public class GlobalMembers
{
	/*
	 * 01.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: liuquan
	 */
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{ //????
	//		int number;
	//		int chinese;
	//		int math;
	//		int all;
	//	}
	//	stu[100000];
		int n;
		int i;
		int j;
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{ //??
			stu[i].number = ConsoleInput.readToWhiteSpace(true);
			stu[i].chinese = ConsoleInput.readToWhiteSpace(true);
			stu[i].math = ConsoleInput.readToWhiteSpace(true);
			stu[i].all = stu[i].chinese + stu[i].math;
		}
		/*for(j=1;j<n;j++){//?????
			for(i=1;i<n-j;i++){
				if(stu[i].all<stu[i+1].all){
					t=stu[i].all;
					stu[i].all=stu[i+1].all;
					stu[i+1].all=t;
					t1=stu[i].number;
					stu[i].number=stu[i+1].number;
					stu[i+1].number=t1;
				}
			}
		}*/
		for (i = 2;i <= n;i++)
		{
			if (stu[n1].all < stu[i].all)
			{
				n1 = i;
			}

		}
		for (i = 2;i <= n;i++)
		{
			if (i == n1)
			{
			  continue;
			}
			if (stu[n2].all < stu[i].all)
			{
				n2 = i;
			}
		}
		for (i = 2;i <= n;i++)
		{
			if (i == n2 || i == n1)
			{
			   continue;
			}
			if (stu[n3].all < stu[i].all)
			{
				n3 = i;
			}
		}
			System.out.print(stu[n1].number);
			System.out.print(" ");
			System.out.print(stu[n1].all);
			System.out.print("\n");
			System.out.print(stu[n2].number);
			System.out.print(" ");
			System.out.print(stu[n2].all);
			System.out.print("\n");
			System.out.print(stu[n3].number);
			System.out.print(" ");
			System.out.print(stu[n3].all);
			System.out.print("\n");
		return 0;
	}
}

