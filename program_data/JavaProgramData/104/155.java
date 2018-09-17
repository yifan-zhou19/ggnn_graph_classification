package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *px, *py;
		int px;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *py;
		int py;
		void tree(int x, int * p);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}

		px = a;
		py = b;
		tree(x, px);
		tree(y, py);
		t = 0;
		for (i = 0; i < 10; i++)
		{
			for (j = 0; j < 10; j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d", a[i]);
					t = 1;
					break;
				}
			}
			if (t == 1)
			{
				 break;
			}
		}

	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void tree(int x, int * p)
	{
		int i;
		for (i = 0; ; i++, p++)
		{
			*p = x;
			if (x != 1)
			{
				if (x % 2 == 1)
				{
					x = (x - 1) / 2;
				}
				else
				{
					x = x / 2;
				}
			}
			else
			{
				break;
			}
		}
	}
}

