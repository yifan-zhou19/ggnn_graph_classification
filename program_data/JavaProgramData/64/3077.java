package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[80];
		int[] b = new int[80];
		int k = 0;
		int m;
		int code1;
		int code2;
		double[] S = new double[80];
		double t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct S
	//	{
	//	double x;
	//	double y;
	//	double z;
	//	}
	//	point[13];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			point[i].x = ConsoleInput.readToWhiteSpace(true);
			point[i].y = ConsoleInput.readToWhiteSpace(true);
			point[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++) //????Cn2
			{
				S[k] = Math.sqrt((point[i].x - point[j].x) * (point[i].x - point[j].x) + (point[i].y - point[j].y) * (point[i].y - point[j].y) + (point[i].z - point[j].z) * (point[i].z - point[j].z)); //???
				a[k] = i;
				b[k] = j;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--) //?????
			{
				if (S[j] > S[j - 1])
				{
					t = S[j];
					S[j] = S[j - 1];
					S[j - 1] = t; //????
					m = a[j];
					a[j] = a[j - 1];
					a[j - 1] = m; //???????
					m = b[j];
					b[j] = b[j - 1];
					b[j - 1] = m; //???????
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			code1 = a[i];
			code2 = b[i];
			System.out.print("(");
			System.out.print((int)point[code1].x);
			System.out.print(",");
			System.out.print((int)point[code1].y);
			System.out.print(",");
			System.out.print(point[code1].z);
			System.out.print(")-(");
			System.out.print((int)point[code2].x);
			System.out.print(",");
			System.out.print((int)point[code2].y);
			System.out.print(",");
			System.out.print(point[code2].z);
			System.out.print(")=");
			System.out.printf("%.2lf",S[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

