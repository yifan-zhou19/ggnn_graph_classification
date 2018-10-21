package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p[5],* q[5];
		int[] p = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * q[5];
		int[] q = new int[5];
		int[][] a = new int[5][5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * point;
		point = a;

		int i;
		int j;
		for (i = 0;i < 25;i++)
		{
				*point = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				point++;
		}

		for (i = 0;i < 5;i++)
		{
			p[i] = * (a + i);
			for (j = 0,point = (a + i) ;j < 5; point++,j++)
			{
				if (*point > p[i])
				{
					p[i] = point;
				}
			}
		}

		int flag = 0;
		for (i = 0;i < 5;i++)
		{
			int t = 0;
			q[i] = a + i;
			for (j = 0,point = q[i]; j < 5 ;j++,point += 5)
			{
				if (*point < q[i])
				{
					q[i] = point;
					t = j;
				}
			}
			if (q[i] == p[t])
			{
					System.out.print(t + 1);
					System.out.print(' ');
					System.out.print(i + 1);
					System.out.print(' ');
					System.out.print((q + i));
					System.out.print("\n");
					flag = 1;
			}
		}

		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

