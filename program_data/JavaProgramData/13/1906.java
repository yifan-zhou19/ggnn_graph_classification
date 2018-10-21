package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int i;
		int j;
		int r;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				*(a + i) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			r = 0;
			for (j = 0;j < i;j++)
			{
				if (*(a + i) == *(a + j))
				{
					r = 1;
				}
			}
			if (r == 0 && d == 0)
			{
				System.out.printf("%d",*(a + i));
				d = 1;
			}
			else if (r == 0 && d == 1)
			{
				System.out.printf(" %d",*(a + i));
			}
		}
		return 0;
	}
}

