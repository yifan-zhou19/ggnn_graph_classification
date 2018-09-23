/*
 * ????????.cpp
 *
 *  Created on: 2010-12-24
 *      Author: wangwei
 */
public class student
{
	public int id;
	public int chinese;
	public int math;
	public int together;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static student t = new student();
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			stu[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].chinese = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].together = stu[i].chinese + stu[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i;j < n;j++)
			{
				if (stu[i].together < stu[j].together)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu[i];
					t.copyFrom(stu[i]);
					stu[i] = stu[j];
					stu[j] = t;
				}
			}
		}
				for (i = 0;i < 3;i++)
				{
					System.out.print(stu[i].id);
					System.out.print(' ');
					System.out.print(stu[i].together);
					System.out.print("\n");
				}
				return 0;
	}
}

