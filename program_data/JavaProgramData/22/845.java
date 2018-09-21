package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k = 0;
		int b;
		int c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		b = i + 1;
		for (i = 0;i < b - 1;i++)
		{
			for (j = 0;j < b - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		for (i = 0;i < b - 1;i++)
		{
			if (a[i] != a[i + 1])
			{
				System.out.printf("%d\n",a[i + 1]);
				k = 1;
				break;
			}
		}
			if (k == 0)
			{
				System.out.print("No");
			}

	}
}

