package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int n;
		int k;
		int sum;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		sum = n;
		p = a;
		for (i = 0;i < sum;i++)
		{
			if (a[i] == k)
			{

				for (j = i;j < sum;j++)
				{
					*(p + j) = *(p + j + 1);

				}
	i = i - 1;
				sum = sum - 1;
			}
		}
		p = a;
		for (i = 0;i < sum;i++)
		{
			System.out.printf("%d",*(p + i));
			if (i != sum - 1)
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}

}

