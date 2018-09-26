package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int temp;
		int flag = 0;
		int q = 0;
		int i;
		int j;
		int n;
		int[] a = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			if ((temp & 1) != 0)
			{
			a[q++] = temp;
			}
		}
		for (i = q - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < q;i++)
		{
			if (flag == 0)
			{
				flag = 1;
			}
			else
			{
				System.out.print(",");
			}
			System.out.printf("%d",a[i]);
		}
	}
}

