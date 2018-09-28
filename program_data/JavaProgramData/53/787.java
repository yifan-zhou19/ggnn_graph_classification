package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *r;
		int r;
		int i;
		int j;
		int count = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == a[j])
				{
					break;
				}
			}
			if (j == n)
			{
				count++;
			}
		}
		for (p = a + n - 1;p > a;p--)
		{
			for (q = a;q < p;q++)
			{
				if (p == q)
				{
					for (r = p;r < a + n;r++)
					{
						r = *(r + 1);
					}
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < count;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}

