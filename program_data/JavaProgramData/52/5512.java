package <missing>;

public class GlobalMembers
{
	public static void yidong(int[] a1, int len)
	{
		int j;
		int temp;
		for (j = 1;j < len;j++)
		{
			temp = a1[j];
			a1[j] = a1[0];
			a1[0] = temp;


		}

		return;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < m;i++)
		{
			yidong(a, n);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return 0;
	}
}

