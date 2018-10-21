package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] a = new int[300];
		int m1 = 0;
		int m2 = -129;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
			if (System.in.read() == '\n')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 0;j < i;j++)
			{
				if (m1 < a[j])
				{
					m1 = a[j];
				}
			}
			for (j = 0;j < i;j++)
			{
				if (m2 < a[j] && a[j] != m1)
				{
					m2 = a[j];
				}
			}
			if (m2 == -129)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",m2);
			}
		}
	}
}

