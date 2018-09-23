/*
 * 1000012826_????????.cpp
 *
 *  Created on: 2010-12-24
 *      Author: Administrator
 */

public class Student
{
	public int num;
	public int mscore;
	public int cscore;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100001);
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int[][] b = new int[201][100];
		int[][] a = new int[201][100];
		int j = 200;
		int count = 3;
		int k = 0;
		int[] c = new int[201];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			stu[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].mscore = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].cscore = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].total = stu[i].mscore + stu[i].cscore;
		}
		do
		{
			b[stu[m].total][c[stu[m].total]] = stu[m].total; //??????? ,c?stu[m].total????????
			a[stu[m].total][c[stu[m].total]] = stu[m].num; //?????????
			if (c[stu[m].total] < 4)
			{
				c[stu[m].total]++; //???????
			}
			m++;
		}while (m < n);
			for (j = 200;j >= 0;j--)
			{
				for (k = 0;k < 100 && count>0;k++)
				{
					if (b[j][k] != 0)
					{
						System.out.print(a[j][k]);
						System.out.print(" ");
						System.out.print(b[j][k]);
						System.out.print("\n");
						count--;
					} //??????
				}
			}
	}
}

