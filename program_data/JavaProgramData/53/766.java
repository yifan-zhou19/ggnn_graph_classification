package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[400];
		int[] b = new int[400];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
				p + i = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (*(p + j) != *(p + i))
				{
					b[i]++;
				}

			}
			if (b[i] == i)
			{
			System.out.printf(",%d",*(p + i));
			}

		}
	}

}

