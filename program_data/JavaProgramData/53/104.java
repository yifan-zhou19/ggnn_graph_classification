package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
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
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(p + i) != 797)
			{
				for (j = 1;j < n - i;j++)
				{

					if (*(p + i) == *(p + i + j))
					{
						*(p + i + j) = 797;
					}
				}
			}
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			if (*(p + i) != 797)
			{
				System.out.printf(",%d",*(p + i));
			}
		}
		return 0;
	}



}

