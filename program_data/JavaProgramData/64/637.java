package <missing>;

public class GlobalMembers
{
	/*
	 * justexp.cpp
	 *
	 *  Created on: 2011-11-18
	 *      Author: dell
	 */
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n * (n - 1) / 2;
		int[][] point = new int[n][3];
		for (i = 0;i < n;i++)
		{
			point[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			point[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		int point1[3];
	//		int point2[3];
	//		float len;
	//		int mark1;
	//		int mark2;
	//	}
	//	distance[m],temp;
		for (k = i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++,k++)
			{
				distance[k].len = 0;
				for (l = 0;l < 3;l++)
				{
					distance[k].mark1 = i;
					distance[k].mark2 = j;
					distance[k].point1[l] = point[i][l];
					distance[k].point2[l] = point[j][l];
					distance[k].len += (point[i][l] - point[j][l]) * (point[i][l] - point[j][l]);
				}
				distance[k].len = Math.sqrt(distance[k].len);
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (distance[i].len < distance[j].len)
				{
					temp = distance[i];
					distance[i] = distance[j];
					distance[j] = temp;
				}
				if (distance[i].len == distance[j].len)
				{
					if ((distance[i].mark1 > distance[j].mark1) || ((distance[i].mark1 == distance[j].mark1) && (distance[i].mark2 > distance[j].mark2)))
					{
						temp = distance[i];
						distance[i] = distance[j];
						distance[j] = temp;
					}
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.print('(');
			System.out.print(distance[i].point1[0]);
			System.out.print(',');
			System.out.print(distance[i].point1[1]);
			System.out.print(',');
			System.out.print(distance[i].point1[2]);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(distance[i].point2[0]);
			System.out.print(',');
			System.out.print(distance[i].point2[1]);
			System.out.print(',');
			System.out.print(distance[i].point2[2]);
			System.out.print(')');
			System.out.printf("=%.2f\n",distance[i].len);
		}
		return 0;
	}
}

