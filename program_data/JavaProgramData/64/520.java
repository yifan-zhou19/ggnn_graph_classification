public class zuobiao
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static zuobiao[] s = tangible.Arrays.initializeWithDefaultzuobiaoInstances(10); //??xyz??????
	public static double[] d = new double[100]; //d??????????
	public static double temp;
	public static int[] qian = new int[100]; //qian hou ?????????????????????
	public static int[] hou = new int[100];
	public static int temp1;
	public static int i;
	public static int j;
	public static int k = 0;

	public static void dis(int a, int b)
	{
		int a1;
		int a2;
		int a3;
		a1 = s[a].x - s[b].x;
		a2 = s[a].y - s[b].y;
		a3 = s[a].z - s[b].z;
		d[k] = Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3); //????
		qian[k] = a; //?k??????????
		hou[k] = b; //?k??????????
		k++;
	}
	public static void paixu()
	{
		for (i = 0 ; i < k - 1 ; i++)
		{
			for (j = i + 1 ; j < k ; j++)
			{
				if (d[i] < d[j])
				{
					temp = d[i]; //???????????qian hou????
					d[i] = d[j];
					d[j] = temp;
					temp1 = qian[i];
					qian[i] = qian[j];
					qian[j] = temp1;
					temp1 = hou[i];
					hou[i] = hou[j];
					hou[j] = temp1;
				}
				else if (d[i] == d[j]) //???????qian hou??????????
				{
					if (qian[i] > qian[j] || (qian[i] == qian[j] && hou[i] > hou[j]))
					{
						temp = d[i];
						d[i] = d[j];
						d[j] = temp;
						temp1 = qian[i];
						qian[i] = qian[j];
						qian[j] = temp1;
						temp1 = hou[i];
						hou[i] = hou[j];
						hou[j] = temp1;
					}
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			s[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = i + 1 ; j < n ; j++)
			{
				dis(i, j);
			}
		}
		paixu();
		for (i = 0 ; i < k ; i++)
		{
			System.out.print("(");
			System.out.print(s[qian[i]].x);
			System.out.print(",");
			System.out.print(s[qian[i]].y);
			System.out.print(",");
			System.out.print(s[qian[i]].z);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(s[hou[i]].x);
			System.out.print(",");
			System.out.print(s[hou[i]].y);
			System.out.print(",");
			System.out.print(s[hou[i]].z);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", d[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

