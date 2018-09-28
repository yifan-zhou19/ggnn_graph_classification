package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int k;
		 int i;
		 int num = 0;
		 int[] a = new int[100001];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
		int max; //???????????????????
		max = a + n;
		for (p1 = a;p1 < max;p1++) //??????????????????????????
		{
			if (*p1 == k)
			{
					num++;
				for (p2 = p1;p2 < (a + n);p2++)
				{
					*p2 = (p2 + 1);
				}
				p1--;
			}
		}
		max = a + n - num - 1;
		for (p1 = a;p1 < max;p1++) //???????
		{
		System.out.printf("%ld ",*p1);
		}
		System.out.printf("%ld",*p1);
	}
}

