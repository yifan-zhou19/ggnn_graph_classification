package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int num = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int*)calloc(n,sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int p = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
		int j = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + j = Integer.parseInt(tempVar2);
			}
			int k;
			int l = 0;
			for (k = 0;k <= j - 1;k++)
			{
				if (*(p + j) == *(p + k))
				{
					l++;
				}
			}
			if (l == 0)
			{
				j++;
			}
		}
		for (i = 1;i < j;i++)
		{
		System.out.printf("%d,",*(p + i - 1));
		}
		System.out.printf("%d\n",*(p + i - 1));
	}


}

