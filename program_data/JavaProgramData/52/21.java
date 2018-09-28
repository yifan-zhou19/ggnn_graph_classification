package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int a = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = Integer.parseInt(tempVar3);
			}
		}
		int t;
		int t1;
		for (j = 0;j < m;j++)
		{
			t = a[n - 1];
			for (i = 0;i < n;i++)
			{

				t1 = a[i];
				a[i] = t;
				t = t1;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}

