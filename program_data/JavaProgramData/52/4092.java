package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,i,n,j,m;
		int a;
		int i;
		int n;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 a = (int)malloc((n + 1) * (Integer.SIZE / Byte.SIZE));
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= m;i++)
		{
			*(a + 0) = *(a + n);
			for (j = n;j > 0;j--)
			{
				*(a + j) = *(a + j - 1);
			}
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",*(a + i));
		}
		System.out.printf("%d",*(a + i));
	}

}

