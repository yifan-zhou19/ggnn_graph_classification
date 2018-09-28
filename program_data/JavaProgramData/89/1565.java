package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int k;
		int count = 0;
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n * n];
		int[] b = new int[n * n];
		for (i = 0;i <= n * n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			count++;
		}
		int[] c = new int[n];
		for (l = 0;l <= n - 1;l++)
		{
			c[l] = 1;
		}
		for (j = 0;j <= count - 1;j++)
		{
			c[b[j]]++;
		}
		for (k = 0;k <= n - 1;k++)
		{
			if (c[k] == n)
			{
				System.out.printf("%d",k);
				break;
			}
		}
		if (k == n)
		{
			System.out.print("Not Found!");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(b);
	}
}

