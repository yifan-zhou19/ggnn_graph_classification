package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] m = new int[1000];
		int b;
		int k;
		int e;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] % 2 != 0)
			{
				a[i] = m[i];
			}
			else
			{
				a[i] = 0;
			}
		}


		for (int c = 1;c <= b;c++)
		{
			for (i = 0;i < b - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
				  e = a[i + 1];
				 a[i + 1] = a[i];
				 a[i] = e;



				}

			}


		}

			for (i = 0;i < b - 1;i++)
			{
				if (a[i] != 0)
				{
				System.out.printf("%d,",a[i]);
				}
			}
			System.out.printf("%d",a[b - 1]);
			return 0;
	}
}

