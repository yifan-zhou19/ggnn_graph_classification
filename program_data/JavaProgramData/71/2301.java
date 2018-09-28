package <missing>;

public class GlobalMembers
{
	public static int RN(int y)
	{
		int z;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}
	public static int PD(int N,int Y1,int Y2)
	{
		int RN = int y;
		int i;
		int j;
		int k = 0;
		int m = 0;
		if (RN(N) == 1)
		{
			if (Y1 > Y2)
			{
				for (i = Y2;i < Y1;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						k = 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						k = 30;
					}
					else
					{
						k = 29;
					}
					m = m + k;
				}
			}
			if (Y1 < Y2)
			{
				for (i = Y1;i < Y2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						k = 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						k = 30;
					}
					else
					{
						k = 29;
					}
					m = m + k;
				}
			}
		}
		else
		{
			if (Y1 > Y2)
			{
				for (i = Y2;i < Y1;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						k = 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						k = 30;
					}
					else
					{
						k = 28;
					}
					m = m + k;
				}
			}
			if (Y1 < Y2)
			{
				for (i = Y1;i < Y2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						k = 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						k = 30;
					}
					else
					{
						k = 28;
					}
					m = m + k;
				}
			}
		}
		if (m % 7 == 0)
		{
			j = 1;
		}
		else
		{
			j = 0;
		}
		return j;
	}
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *A;
		int A;
		int m;
		int n;
		int b;
		int c;
		int d;
		int i;
		int PD = new int(int N,int Y1,int Y2);
		int RN = int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		A = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			*a = PD(b, c, d);
			a++;
		}
		for (i = 0;i < n;i++,A++)
		{
			if ((A) == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

