package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int N;
		int i;
		int j;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= N;i++)
		{
				for (j = i + 1;j <= N;j++)
				{
				if (a[j] < a[i])
				{
				   temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;
				}
				}
		}
		 System.out.printf("%d\n%d\n",a[N],a[N - 1]);
	}


}

