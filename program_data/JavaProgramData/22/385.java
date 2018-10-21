package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int max = 0;
		int next = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 300;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 300;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < 300;i++)
		{
			if (a[i] != max)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		for (j = 0;j < 300;j++)
		{
			if (next < b[j])
			{
				next = b[j];
			}
		}
		if (next != 0)
		{
			System.out.printf("%d",next);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

