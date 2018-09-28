package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int i;
		int j;
		int s;
		int k;

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
		p = a;
		System.out.printf("%d,",a[0]);
		for (i = 1,k = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p + i) == a[j])
				{
					s = 0;
					break;
				}
				else
				{
					s = 1;
				}

			}

			if (s == 1)
			{
				b[k] = a[i];
				k = k + 1;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
			System.out.printf("%d",b[k - 1]);



	}
}

