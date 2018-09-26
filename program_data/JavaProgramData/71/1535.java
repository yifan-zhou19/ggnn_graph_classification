package <missing>;

public class GlobalMembers
{
	public static int run(int y)
	{
		if ((y % 4 == 0) && (y % 100 != 0))
		{
			return 1;
		}
		else if (y % 400 == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int temp;
		int m1;
		int m2;
		int mark;
		int[] a = new int[13];
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = A;
		a[4] = a[6] = a[9] = a[11] = B;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			a[2] = C;
			a[0] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			mark = run(y);
			if (mark == 1)
			{
				a[2] = C + 1;
			}
			if (m1 < m2)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
				for (j = m1;j < m2;j++)
				{
					a[0] += a[j];
				}
				if (a[0] % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				temp = m1;
				m1 = m2;
				m2 = temp;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
		return 0;
	}
}

