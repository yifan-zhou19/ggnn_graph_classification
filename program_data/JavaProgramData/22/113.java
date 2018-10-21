package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (System.in.read() != ',')
			{
				break;
			}
		} //?i+1???
		if (i == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		for (j = 0;j < i + 1;j++)
		{
			for (k = 0;k < i - j;k++)
			{
				if (a[k] < a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			if (a[j] != a[j + 1])
			{
			break;
			}
		}
		if (j == i)
		{
			System.out.print("No\n");
		}
		else
		{
		System.out.printf("%d\n",a[j + 1]);
		}
		}

	}
}

