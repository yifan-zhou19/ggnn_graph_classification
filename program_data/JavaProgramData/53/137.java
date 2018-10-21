package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int j;
		int x;
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
		p = a;
		for (i = 0;i < n;i++)
		{
			if (*(p + i) != -1)
			{
				for (j = i + 1;j < n;j++)
				{
					if (*(p + j) == *(p + i))
					{
						*(p + j) = -1;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(p + i) != -1)
			{
				System.out.printf("%d",*(p + i));

				break;
			}
		}
		x = i;
		for (i = x + 1;i < n;i++)
		{
			if (*(p + i) != -1)
			{
				System.out.printf(",%d",*(p + i));
			}
		}
	}
}

