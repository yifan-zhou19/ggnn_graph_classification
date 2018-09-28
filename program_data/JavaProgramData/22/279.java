package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		char c;
		int i = 0;
		int n;
		int j;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				a[i] = a[i] * 10 + c - '0';
			}
			else
			{
				i++;
			}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{
			int max = 0;
			for (j = 0;j <= i;j++)
			{
				if (a[j] > max)
				{
					max = a[j];
				}
			}
			for (j = 0;j <= i;j++)
			{
				if (a[j] == max)
				{
					a[j] = 0;
				}
			}
			max = 0;
			for (j = 0;j <= i;j++)
			{
				if (a[j] > max)
				{
					max = a[j];
				}
			}
			if (max != 0)
			{
				System.out.printf("%d",max);
			}
			else
			{
				System.out.print("No");
			}
		}
	}


}
