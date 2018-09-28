package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int temp;
		for (i = 0;scanf("%d,", a[i]) != EOF;i++)
		{
			;
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (a[i] < a[j])
					{
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				if (a[i] != a[i + 1])
				{
					break;
				}
			}
			if (i == n - 1)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",a[i + 1]);
			}
		}
	}

}
