package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int len;
		int temp;
		int j;
		while (scanf("%d", a[i++]) != EOF)
		{
			System.in.read();
		}
		len = i - 1;
		if (len == 1)
		{
		System.out.print("No");
		}
		else
		{
		for (i = 0;i < len - 1;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (a[i] < a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 1;i < len;i++)
		{
			if (a[i] != a[0])
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		if (i == len)
		{
		System.out.print("No");
		}
		}
	}
}
