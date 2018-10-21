package <missing>;

public class GlobalMembers
{
	public static int primejud(int n)
	{
	int i;
	for (i = 2;i < n / 2;i++)
	{
	if (n % i == 0)
	{
	break;
	}
	}
	if (i >= n / 2)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int huiwenjud(int n)
	{
	int i;
	int c;
	int a = Math.log10(n);
	int[] b = new int[10];
	for (i = 0;i <= a;i++)
	{
	b[i] = n / Math.pow(10,a - i);
	n = n % ((int)Math.pow(10,a - i));
	}
	c = (a + 1) / 2;
	for (i = 0;i < c;i++)
	{
	if (b[i] != b[a - i])
	{
	break;
	}
	}
	if (i >= c)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j = 0;
		int[] num = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			if (primejud(i) != 0 && huiwenjud(i) != 0)
			{
			num[j++] = i;
			}
		}
	if (j == 0)
	{
		System.out.print("no");
	}
	else
	{
			for (i = 0;i < j - 1;i++)
			{
	System.out.printf("%d,",num[i]);
			}
			System.out.printf("%d",num[j - 1]);
	}
	return 0;
	}
}

