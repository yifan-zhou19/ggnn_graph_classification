package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,i,n,j,k;
		int p;
		int i;
		int n;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		*(p + 1) = p = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			if (k > 2)
			{
				for (i = 2;i < k;i++)
				{
				*(p + i) = *(p + i - 1) + *(p + i - 2);
				}
				System.out.printf("%d\n",*(p + k - 1));
			}
			else
			{
				System.out.printf("%d\n",*(p + k - 1));
			}
		}
	}

}

