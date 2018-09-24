package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		b = a[0];
		for (i = n - m;i <= n - 1;i++)
		{
			System.out.printf("%d ",*(b + i));
		}
		for (i = 0;i <= n - m - 1;i++)
		{
			System.out.printf("%d",*(b + i));
			if (i != n - m - 1)
			{
				System.out.print(" ");
			}
		}

	}
}

