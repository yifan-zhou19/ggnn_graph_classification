package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a;
		int i;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
		}
		for (i = 0;i < n;i++)
		{
						if (a[i] % 2 != 0)
						{
											b[k] = a[i];
											k += 1;
						}
		}
		for (i = 0;i < k - 1;i++)
		{
						for (j = i + 1;j < k;j++)
						{
										if (b[j] < b[i])
										{
													 t = b[j];
													 b[j] = b[i];
													 b[i] = t;
										}
						}
		}
		for (i = 0;i < k;i++)
		{
						 if (i != 0)
						 {
							 System.out.print(",");
						 }
						 System.out.printf("%d",b[i]);
		}
		return 0;
	}
}

