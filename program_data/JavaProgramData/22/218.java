package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[400];
		int i = 0;
		int max;
		int j;
		int max2;
		while (scanf("%d", a[i]) != EOF)
		{
			scanf(",");
			i++;
		}
		i--;
		max = 0;
		max2 = -1;
		for (j = 0;j <= i;j++)
		{
			if (max < a[j])
			{
				max = a[j];
			}
		}
		for (j = 0;j <= i;j++)
		{
			if ((max2 < a[j]) && (a[j] < max))
			{
				max2 = a[j];
			}
		}
		if (max2 == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",max2);
		}
	}
}
