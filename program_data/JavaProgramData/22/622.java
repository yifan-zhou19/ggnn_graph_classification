package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[300];
		int n = 1;
		int temp;
	char c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[1] = Integer.parseInt(tempVar);
	}
	while ((c = System.in.read()) != '\n')
	{
		n++;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[n] = Integer.parseInt(tempVar2);
		}
	}
	if (n == 1)
	{
		System.out.print("No");
	}
	else
	{
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 2;i <= n;i++)
		{
			if (a[i] < a[1])
			{
				break;
			}
		}
		if (i <= n)
		{
			System.out.printf("%d",a[i]);
		}
		else
		{
			System.out.print("No");
		}
	}
	}
}

