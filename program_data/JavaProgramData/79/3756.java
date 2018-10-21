package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *end;
		int end;
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
		while (m != 0 || n != 0)
		{
			if (n == 1)
			{
				System.out.print("1\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
			}
			end = a + n;
			for (p = a;p < end;p++)
			{
				*p = 1;
			}
			p = a - 1;
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < m;j++)
				{
					p++;
					if (p >= end)
					{
						p -= n;
					}
					if (*p == 0)
					{
						j--;
					}
				}
				*p = 0;
			}

		 for (i = 1;i <= n;i++)
		 {
				if (a[i - 1] != 0)
				{
					System.out.printf("%d\n",i);
				}
		 }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
		}

	}

}

