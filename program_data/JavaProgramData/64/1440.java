//**********************
//* ??? ????    *
//* 1200012878 ???  *
//* 12?15?           *
//**********************
public class dian
{
	public int a;
	public int b;
	public int c;
}
public class len
{
	public int s;
	public int m;
	public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static dian[] p = tangible.Arrays.initializeWithDefaultdianInstances(10); // ??????????
	public static len[] q = tangible.Arrays.initializeWithDefaultlenInstances(45); // ?????????????
	public static int Main()
	{
		int n;
		int count = -1;
		int i;
		int j;
		int k;
		int temp1;
		int temp2;
		double temp3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i].a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i].c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0; j < n - 1; j++)
		{
			for (k = j + 1; k < n; k++)
			{
				count++;
				q[count].dis = Math.sqrt((p[j].a - p[k].a) * (p[j].a - p[k].a) + (p[j].b - p[k].b) * (p[j].b - p[k].b) + (p[j].c - p[k].c) * (p[j].c - p[k].c));
				q[count].s = j;
				q[count].m = k;
			}
		} // ??????????
		for (i = 0; i < count; i++)
		{
			for (j = count - 1; j >= i; j--)
			{
				if (q[j].dis < q[j + 1].dis)
				{
					temp1 = q[j].s;
					temp2 = q[j].m;
					temp3 = q[j].dis;
					q[j].s = q[j + 1].s;
					q[j].m = q[j + 1].m;
					q[j].dis = q[j + 1].dis;
					q[j + 1].s = temp1;
					q[j + 1].m = temp2;
					q[j + 1].dis = temp3;
				}
			}
		} // ??????????????????????????????????
		for (i = 0; i <= count; i++)
		{
			System.out.print("(");
			System.out.print(p[q[i].s].a);
			System.out.print(",");
			System.out.print(p[q[i].s].b);
			System.out.print(",");
			System.out.print(p[q[i].s].c);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(p[q[i].m].a);
			System.out.print(",");
			System.out.print(p[q[i].m].b);
			System.out.print(",");
			System.out.print(p[q[i].m].c);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", q[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

