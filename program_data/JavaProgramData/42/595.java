package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = a,i = 0;p < a + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(p + i) = tempVar2;
			}
		}
		System.out.print("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (p = a,q = a;p < a + n;p++)
		{
			if (*p != k)
			{
				*q = p;
				q++;
			}
		}
		for (p = a;p < (q - 1);p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*(q - 1));
		System.out.print("\n");
	}

}

