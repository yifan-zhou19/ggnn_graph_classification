package <missing>;

public class GlobalMembers
{
	public static int isin(tangible.RefObject<Integer> b, int chang, int value) //??????????
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		for (p = b.argValue;p < b.argValue + chang;p++)
		{
		if (*p == value)
		{
				return 1;
		}
		}
		return 0;

	}

	public static void Main()
	{
		int i;
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int N;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
			for (p = a,N = 0;p < a + n;p++)
			{
			tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
				if (q = isin(tempRef_b, N, *p) == 0)
				{
					b = tempRef_b.argValue;
					b[N] = p;
				N++;
				}
				else
				{
					b = tempRef_b.argValue;
				}
			}
				for (p = b;p < b + N;p++)
				{
					System.out.printf("%d%s",*p,p == b + N - 1?"\n":",");
				}
	}




}

