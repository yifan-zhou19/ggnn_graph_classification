package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 1;
		int[] a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * b;
		int b;
		a = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			x = b[i];
			for (j = i - 1;j >= 0 && b[j] > x;j--)
			{
				b[j + 1] = b[j];
			}
			b[j + 1] = x;
		}
		for (i = 2;i < k;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
		return 0;
	}
}

