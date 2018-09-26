package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????(14-4) ????      **
	//*?????? 1300012887 **
	//*???2013.12.11 **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dian //?????dian
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
		a[12]; //???????a
		for (i = 0; i < n; i++)
		{
			a[i].x = ConsoleInput.readToWhiteSpace(true);
			a[i].y = ConsoleInput.readToWhiteSpace(true);
			a[i].z = ConsoleInput.readToWhiteSpace(true);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct cha //?????cha
	//	{
	//		int x1;
	//		int y1;
	//		int z1;
	//		int x2;
	//		int y2;
	//		int z2;
	//		double c;
	//	}
		b[46], t; //???????b,???t
		for (i = 0; i < n - 1; i++) //???????????
		{
			for (j = i + 1; j < n; j++)
			{
				b[k].x1 = a[i].x;
				b[k].y1 = a[i].y;
				b[k].z1 = a[i].z;
				b[k].x2 = a[j].x;
				b[k].y2 = a[j].y;
				b[k].z2 = a[j].z; //???
				b[k].c = Math.sqrt((b[k].x2 - b[k].x1) * (b[k].x2 - b[k].x1) + (b[k].y2 - b[k].y1) * (b[k].y2 - b[k].y1) + (b[k].z2 - b[k].z1) * (b[k].z2 - b[k].z1)); //??????
				k++; //??
			}
		}
		for (i = 0; i < k - 1; i++) //????????????
		{
			for (j = 0; j < k - i - 1; j++)
			{
				if (b[j].c < b[j + 1].c)
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0; i < k; i++) //??????
		{
			System.out.print("(");
			System.out.print(b[i].x1);
			System.out.print(",");
			System.out.print(b[i].y1);
			System.out.print(",");
			System.out.print(b[i].z1);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(b[i].x2);
			System.out.print(",");
			System.out.print(b[i].y2);
			System.out.print(",");
			System.out.print(b[i].z2);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", b[i].c);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}



}

