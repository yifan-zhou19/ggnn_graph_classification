package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	p[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		int x1,x2;
	//		int y1,y2;
	//		int z1,z2;
	//		double d;
	//	}
	//	d[46],t;
		int n;
		int i;
		int j;
		int k = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p[i].x = ConsoleInput.readToWhiteSpace(true);
			p[i].y = ConsoleInput.readToWhiteSpace(true);
			p[i].z = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k].x1 = p[i].x;
				d[k].x2 = p[j].x;
				d[k].y1 = p[i].y;
				d[k].y2 = p[j].y;
				d[k].z1 = p[i].z;
				d[k].z2 = p[j].z;
				d[k].d = Math.sqrt(((double)d[k].x1 - (double)d[k].x2) * ((double)d[k].x1 - (double)d[k].x2) + ((double)d[k].y1 - (double)d[k].y2) * ((double)d[k].y1 - (double)d[k].y2) + ((double)d[k].z1 - (double)d[k].z2) * ((double)d[k].z1 - (double)d[k].z2));
				k++;
			}
		}
		m = k;
		distance pointer1;
		distance pointer2;
		pointer1 = d;
		pointer2 = t;
		for (i = 0;i < m - 1;i++)
		{
			for (j = m - 1;j > i;j--)
			{
				if ((pointer1 + j).d > (pointer1 + j - 1).d)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *pointer2=*(pointer1+j);
					pointer2.copyFrom((pointer1 + j));
					*(pointer1 + j) = *(pointer1 + j - 1);
					*(pointer1 + j - 1) = pointer2;
				}
			}
		}
		for (k = 0;k < m;k++)
		{
				System.out.print("(");
				System.out.print(d[k].x1);
				System.out.print(",");
				System.out.print(d[k].y1);
				System.out.print(",");
				System.out.print(d[k].z1);
				System.out.print(")");
				System.out.print("-");
				System.out.print("(");
				System.out.print(d[k].x2);
				System.out.print(",");
				System.out.print(d[k].y2);
				System.out.print(",");
				System.out.print(d[k].z2);
				System.out.print(")");
				System.out.print("=");
				System.out.printf("%.2f", d[k].d);
				System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

