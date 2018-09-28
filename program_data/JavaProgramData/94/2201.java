package <missing>;

public class GlobalMembers
{
	public static int Main() //?~
	{
		int i;
		int j;
		int s;
		int t;
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0,i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
			j++;
			}
		}
		for (i = 0;i < j;i++)
		{

			for (t = 0;t < j - 1;t++)
			{
				if (b[t] >= b[t + 1])
				{
				s = b[t];
			   b[t] = b[t + 1];
			   b[t + 1] = s;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i++)
		{
				System.out.printf(",%d",b[i]);
		}
		return 0;
	}

}

