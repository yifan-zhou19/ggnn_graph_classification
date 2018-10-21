package <missing>;

public class GlobalMembers
{
	/*
	 * structure_4.cpp
	 *
	 *  Created on: 2010-12-29
	 *      Author: ???
	 *        ??? ????
	 */



	public static int Main()
	{
		int n;
		int i;
		int j;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{ //??????
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	p[100];
		for (i = 0;i < n;i++) //????????
		{
			p[i].x = ConsoleInput.readToWhiteSpace(true);
			p[i].y = ConsoleInput.readToWhiteSpace(true);
			p[i].z = ConsoleInput.readToWhiteSpace(true);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{ //??????????
	//		double dis;
	//		int i;
	//		int j;
	//	}
	//	d[5000],temp;
		for (i = 0,num = 0;i < n - 1;i++) //?????
		{
			for (j = i + 1;j < n;j++,num++)
			{
				d[num].dis = Math.sqrt(Math.pow(p[i].x - p[j].x,2.0) + Math.pow(p[i].y - p[j].y,2.0) + Math.pow(p[i].z - p[j].z,2.0));
				d[num].i = i;
				d[num].j = j;
			}
		}
		for (i = 0;i < num - 1;i++) //?????
		{
			for (j = 0;j < num - i - 1;j++)
			{
				if (d[j].dis < d[j + 1].dis)
				{
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < num;i++) //????
		{
			System.out.print('(');
			System.out.print(p[d[i].i].x);
			System.out.print(',');
			System.out.print(p[d[i].i].y);
			System.out.print(',');
			System.out.print(p[d[i].i].z);
			System.out.print(")-(");
			System.out.print(p[d[i].j].x);
			System.out.print(',');
			System.out.print(p[d[i].j].y);
			System.out.print(',');
			System.out.print(p[d[i].j].z);
			System.out.print(")=");
			System.out.printf("%.2f", d[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

