package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sz,i,j,k,n,x;
		int sz;
		int i;
		int j;
		int k;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sz = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		x = n;
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			for (j = i + 1;j < x;j++)
			{
				if (sz[i] == sz[j])
				{
					for (k = j;k < x - 1;k++)
					{
						sz[k] = sz[k + 1];
					}
					x--;
					j--;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",sz[i]);
			}
			else
			{
				System.out.printf(",%d",sz[i]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
		return 0;
	}
}

