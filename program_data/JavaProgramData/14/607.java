/*
 * mark.cpp
 *
 *  Created on: 2011-12-9
 *      Author: admin
 */
public class student
{
	public int id;
	public int chi;
	public int math;
}
public class maxer
{
	public int id;
	public int mark;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		student temp = new student();
		maxer max = new maxer(); //top3????
		maxer[] top = tangible.Arrays.initializeWithDefaultmaxerInstances(3);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].chi = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= 3;i++)
		{ //????
			max.mark = 0;
			for (j = i;j <= n;j++)
			{
			if (a[j].chi + a[j].math > max.mark)
			{
				max.id = a[j].id;
				max.mark = a[j].chi + a[j].math; //?????
			}
			}
			top[i - 1] = max; //????????????????????????
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
			temp.copyFrom(a[i]);
			a[i] = a[max.id];
			a[max.id] = temp;
		}
		for (i = 0;i <= 2;i++)
		{
			System.out.print(top[i].id);
			System.out.print(' ');
			System.out.print(top[i].mark);
			if (i != 2)
			{
				System.out.print("\n");
			}
		}
	return 0;
	}

}

