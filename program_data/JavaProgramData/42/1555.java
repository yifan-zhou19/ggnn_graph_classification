package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int k;
		int b = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] a = new int[N];
		for (i = 0;i < N;i++)
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

		for (i = 0;i < N;i++)
		{
			if (a[i] != k)
			{
			sum++;
			}

		}
		for (i = 0;i < N;i++)
		{

			if (a[i] != k)
			{
				b++;
				if (b != sum)
				{
				System.out.printf("%d ",a[i]);
				}
				else
				{
				System.out.printf("%d",a[i]);
				}
			}

		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		return 0;

	}
}

