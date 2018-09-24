package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[333];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p++ = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		System.out.printf("%d",*p);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p + i) == *(p + j))
				{
					k++;
				}
			}
			if (k == 0)
			{
				System.out.printf(",%d",*(p + i));
			}
			k = 0;
		}
	}
}

