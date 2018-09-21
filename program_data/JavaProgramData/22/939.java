package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[310];
	int n;
	int x;
	for (int i = 0;i < 310;i++)
	{
		a[i] = -1;
	}
	for (int i = 0;i < 310;i++)
	{
		if ((scanf("%d,", a[i])) == EOF)
		{
			n = i;
			break;
		}
	}
	x = a[0];
	for (int i = 1;i < n;i++)
	{
		if (a[i] > x)
		{
		x = a[i];
		}
	}
	for (int i = 0;i < n;i++)
	{
		if (a[i] == x)
		{
			a[i] = -1;
		}
	}
	x = a[0];
	for (int i = 1;i < n;i++)
	{
		if (a[i] > x)
		{
		x = a[i];
		}
	}
	if (x == -1)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",x);
	}
	}

}
