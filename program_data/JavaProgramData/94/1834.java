package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int len)
	{
		int i;
		int j;
		int temp;
		for (j = 1; j < len; j++)
		{
			for (i = 0; i < len - j; i++)
			{
				if (a[i] > a[i + 1])
				{
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pi;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pj;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (pi = a; pi < (a + n); pi++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pi = Integer.parseInt(tempVar2);
			}
		}
		for (pi = a, pj = b; pi < (a + n); pi++)
		{
			if ((*pi) % 2 == 1)
			{
				*pj = pi;
				pj++;
			}
		}
		bubble(b, pj - b);
		System.out.printf("%d",b[0]);
		for (pi = b + 1; pi < pj; pi++)
		{
			System.out.printf(",%d",*pi);
		}
	}
}

