package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	a[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int m[3];
	//		int n[3];
	//		double dis;
	//	}
	//	temp,b[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i].x = ConsoleInput.readToWhiteSpace(true);
			a[i].y = ConsoleInput.readToWhiteSpace(true);
			a[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				b[l].m[0] = a[i].x;
				b[l].m[1] = a[i].y;
				b[l].m[2] = a[i].z;
				b[l].n[0] = a[j].x;
				b[l].n[1] = a[j].y;
				b[l].n[2] = a[j].z;
				b[l].dis = Math.sqrt((a[j].x - a[i].x) * (a[j].x - a[i].x) + (a[j].y - a[i].y) * (a[j].y - a[i].y) + (a[j].z - a[i].z) * (a[j].z - a[i].z));
				l++;
			}
		}
		for (int i = 0;i < n * (n - 1) / 2 - 1;i++)
		{
			for (int j = 0;j < n * (n - 1) / 2 - 1;j++)
			{
				if (b[j].dis < b[j + 1].dis)
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.print("(");
			System.out.print(b[i].m[0]);
			System.out.print(",");
			System.out.print(b[i].m[1]);
			System.out.print(",");
			System.out.print(b[i].m[2]);
			System.out.print(")-(");
			System.out.print(b[i].n[0]);
			System.out.print(",");
			System.out.print(b[i].n[1]);
			System.out.print(",");
			System.out.print(b[i].n[2]);
			System.out.print(")=");
			System.out.printf("%.2f", b[i].dis);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

