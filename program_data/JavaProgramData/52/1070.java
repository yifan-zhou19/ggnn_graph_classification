package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[] a = new int[100];
		int m;
		int n;
		int i;
		int j;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < m;j++)
		{
			p = a;
			t = a[n - 1];
			for (i = n - 1;i > 0;i--)
			{
				*(p + i) = *(p + i - 1);
			}
			a[0] = t;
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}


	}
}

