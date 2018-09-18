/*
 * statistics of scores.cpp
 *
 *  Created on: 2011-12-11
 *      Author: Administrator
 */
public class stu
{
		public int Num;
		public int scoreC;
		public int scoreM;
		public int all;
}

package <missing>;

public class GlobalMembers
{
		public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100005);
	public static void fsort(int first,int last)
	{
		int chosen1;
		int chosen2;
		int p;
		int q;
		if (first >= last)
		{
			return;
		}
		chosen1 = stu[first].all;
		chosen2 = stu[first].Num;
		p = first;
		q = last;
		while (p < q)
		{
			while ((p < q) && (stu[q].all >= chosen1))
			{
				q--;
			}
			if (p < q)
			{
				stu[p].all = stu[q].all;
				stu[p].Num = stu[q].Num;
				p++;
			}
			while ((p < q) && (stu[p].all < chosen1))
			{
				p++;
			}
			if (p < q)
			{
				stu[q].all = stu[p].all;
				stu[q].Num = stu[p].Num;
				q--;
			}
		}
		stu[p].all = chosen1;
		stu[p].Num = chosen2;
		fsort(first, p - 1);
		fsort(p + 1, last);
	}
	public static int Main()
	{
		int m; //????
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++) //????
		{
			stu[i].Num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].scoreC = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].scoreM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			stu[i].all = stu[i].scoreC + stu[i].scoreM;
		}
		fsort(1, m);
		System.out.print(stu[m].Num);
		System.out.print(" ");
		System.out.print(stu[m].all);
		System.out.print("\n");
		System.out.print(stu[m - 1].Num);
		System.out.print(" ");
		System.out.print(stu[m - 1].all);
		System.out.print("\n");
		System.out.print(stu[m - 2].Num);
		System.out.print(" ");
		System.out.print(stu[m - 2].all);
		System.out.print("\n");
		return 0;
	}


}

