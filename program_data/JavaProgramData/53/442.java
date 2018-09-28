package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[305];
		int[] b = new int[305];
		int i;
		int k;
		int n;
		int c;
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
		b[i] = a[i];
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			for (k = 0;k <= i - 1;k++)
			{
			if (a[i] != b[k])
			{
			c = 1;
			}
		else if (a[i] == b[k])
		{
			c = 0;
			break;
		}
			}
		if (c == 1)
		{
			System.out.printf(",%d",a[i]);
		}
		}
	}
}

