package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int[] b = new int[100];
		int[] c = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * start;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *qian;
		int qian;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *hou;
		int hou;
		qian = b;
		hou = c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		for (start = a;start < a + n;start++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				*start = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n - m;i++)
		{
		*(qian + i) = a[i];
		}
		for (i = n - m;i < n;i++)
		{
		*(hou + i - n + m) = a[i];
		}
		for (i = 0;i < m;i++)
		{
		a[i] = (hou + i);
		}
		for (i = m;i < n;i++)
		{
		a[i] = (qian + i - m);
		}

		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[n - 1]);
	}
}

