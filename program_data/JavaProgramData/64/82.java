/*
 * ????????.cpp
 * Created on: 2011-1-1
 * Author: ???
 */
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int abs;
	public int ver;
	public int ord;

}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] coor = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(10); //??????

	public static double fdis(int a, int b, int c, int d, int e, int f)
	{ //??????
		int m;
		double n;
		m = (a - d) * (a - d) + (b - e) * (b - e) + (c - f) * (c - f);
		n = Math.sqrt((double) m);
		return n;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int q;
		int[] flag1 = new int[45];
		int[] flag2 = new int[45];
		int s;
		int t;
		double[] dis = new double[45];
		double tempt;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			coor[i].abs = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			coor[i].ver = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			coor[i].ord = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				dis[k] = fdis(coor[i].abs, coor[i].ver, coor[i].ord, coor[j].abs, coor[j].ver, coor[j].ord);
				flag1[k] = i;
				flag2[k] = j;
				k++;
			}
		}
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			for (q = 0; q < n * (n - 1) / 2 - k - 1; q++)
			{
				if (dis[q] - dis[q + 1] < -1e-6.getValue() != 0)
				{
					s = flag1[q];
					flag1[q] = flag1[q + 1];
					flag1[q + 1] = s;
					t = flag2[q];
					flag2[q] = flag2[q + 1];
					flag2[q + 1] = t;
					tempt = dis[q];
					dis[q] = dis[q + 1];
					dis[q + 1] = tempt; //??
				}
			}
		}
		for (k = 0; k < n * (n - 1) / 2; k++)
		{
			System.out.print("(");
			System.out.print(coor[flag1[k]].abs);
			System.out.print(",");
			System.out.print(coor[flag1[k]].ver);
			System.out.print(",");
			System.out.print(coor[flag1[k]].ord);
			System.out.print(")-(");
			System.out.print(coor[flag2[k]].abs);
			System.out.print(",");
			System.out.print(coor[flag2[k]].ver);
			System.out.print(",");
			System.out.print(coor[flag2[k]].ord);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", dis[k]);
			System.out.printf("%.2f", "\n");
		} //??
		return 0;
	}


}

