package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int b;
		int e;
		int h;
		int[] sz = new int[1000];
		int[] a = new int[1000];
		b = 0;
		e = 0;
		h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
				if (sz[i] % 2 != 0)
				{
						a[b] = sz[i];
						b++;
				}
		}
		for (int k = 0;k < b;k++)
		{
				for (int g = 0;g < b;g++)
				{
						if (a[g] > a[g + 1])
						{
									   h = a[g + 1];
									   a[g + 1] = a[g];
									   a[g] = h;
						}
				}
		}

		for (int x = 1;x <= b;x++)
		{

				if (x < b)
				{
				System.out.printf("%d,",a[x]);
				}
				else
				{
				System.out.printf("%d",a[x]);
				}
				e++;

		}
	return 0;
	}
}

