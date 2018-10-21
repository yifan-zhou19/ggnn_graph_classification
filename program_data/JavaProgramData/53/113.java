package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int d;
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (*(p + i) == *(p + j))
				{
					*(p + j) = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(p + i) != 0)
			{
				System.out.printf("%d",*(p + i));
				d = i;
				break;
			}
		}
		for (i = d + 1;i < n;i++)
		{
			if (*(p + i) != 0)
			{
				System.out.printf(",%d",*(p + i));
			}
		}

	}



}

