package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int A;
		int b;
		int c;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		b = A;
		for (c = 0;b >= 1;c++)
		{
			b = b / 10;
		}
		for (i = 0;i <= c - 1;i++)
		{
			a[i] = A % 10;
			A = A / 10;
		}
		for (i = 0;i <= c - 2;i++)
		{
			System.out.printf("%d",a[i]);
		}
		 System.out.printf("%d\n",a[c - 1]);
	}
}

