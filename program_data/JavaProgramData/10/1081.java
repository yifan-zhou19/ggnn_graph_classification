package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] <= a[j])
				{
					b[i] = (b[j] + 1) > b[i] != 0?(b[j] + 1):b[i];
				}
			}
			max = max > b[i] != 0?max:b[i];
		}
		System.out.printf("%d",max + 1);
	}

}

