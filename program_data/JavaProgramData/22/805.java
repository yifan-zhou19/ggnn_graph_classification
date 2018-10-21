package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int b = 0;
		int c;
		int d = 0;
		int i;
		int j;
		char s;
	for (i = 1;i <= 300;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		b = b + 1;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		if (s != ',')
		{
			break;
		}
	}
	for (i = 1;i <= b;i++)
	{
		for (j = i;j <= b;j++)
		{
			if (a[i] != a[j])
			{
				d = 1;
			}
		if (a[j] > a[i])
		{
			c = a[i];
			a[i] = a[j];
			a[j] = c;
		}
		}
	}
	if ((d == 0) || (b == 1))
	{
		System.out.print("No\n");
	}
	for (i = 2;i <= b;i++)
	{
		if (a[i] != a[1])
		{
			System.out.printf("%d\n",a[i]);
			break;
		}
	}
	}

}

