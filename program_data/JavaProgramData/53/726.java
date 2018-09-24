package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = a;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p + n - 1 = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p + i) != *(p + j))
				{
					k = 0;
				}
				else
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
				System.out.printf(",%d",*(p + i));
			}
		}
		System.out.print("\n");
	}

}

