package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i = 0;
		int l;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		l = a[0];
		while (System.in.read() != 10)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[++i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (a[j] > l)
			{
				l = a[j];
			}
		}
		for (j = 0;j <= i;j++)
		{
			if (l == a[j])
			{
				a[j] = 0;
			}
		}
		l = a[0];
		for (j = 0;j <= i;j++)
		{
			if (a[j] > l)
			{
				l = a[j];
			}
		}
		if (l == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",l);
		}
	}
}

