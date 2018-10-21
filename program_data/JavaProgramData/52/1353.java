package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
		for (i = 1;i <= m;i++)
		{
			int j;
			int t;
			t = (p + n - 1);
			for (j = n - 1;j >= 1;j--)
			{
				*(p + j) = *(p + j - 1);
			}
			p = t;
		}
		for (i = 1;i <= n - 1;i++)
		{
			System.out.printf("%d ",*(p + i - 1));
		}
		System.out.printf("%d",*(p + n - 1));
		System.out.print("\n");
	}

}

