package <missing>;

public class GlobalMembers
{
	public static int check(int[] b, int len, int x)
	{
		int i;
		int flag = 1;
		for (i = 0;i < len;i++)
		{
			if (b[i] == x)
			{
				flag = 0;
				return 0;
				break;
			}
		}
		if (flag != 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int j;
		int i;
		int n;
		int[] a = new int[20100];
		int[] b = new int[20100];
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
		System.out.printf("%d",a[0]);
		b[0] = a[0];
		j = 1;
		for (i = 1;i < n;i++)
		{
			if (check(b, j, a[i]) != 0)
			{
				System.out.printf(" %d",a[i]);
				b[j] = a[i];
				j++;
			}
		}

		return 0;
	}
}

