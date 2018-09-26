package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(n,4);
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
				if (*(p + i) == *(p + j))
				{
					b[i] = 1;
				}
			}
			if (b[i] == 0)
			{
				System.out.printf(",%d",*(p + i));
			}
		}
	}
}

