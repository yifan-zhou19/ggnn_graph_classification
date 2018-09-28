package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k;
		int x;
		int y;
		int[] a = new int[300];
		int[] b = new int[300];
		int h = 0;
	String c = new String(new char[20000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		c = tempVar.charAt(0);
	}
	y = c.length();
	for (i = 0;i < y;i++)
	{
		if (c.charAt(i) != ',')
		{
	a[j] = a[j] * 10 + c.charAt(i) - '0';
		}
	else
	{
	j++;
	}
	}
	for (i = 0;i <= j;i++)
	{
		for (k = 0;k < j - i;k++)
		{
	if (a[k] > a[k + 1])
	{
		x = a[k];
	a[k] = a[k + 1];
	a[k + 1] = x;
	}
		}
	}

	for (i = j - 1;i >= 0;i--)
	{
		b[i] = a[i + 1] - a[i];
	if (b[i] > 0)
	{
		System.out.printf("%d",a[i]);
	h = 1;
	break;
	}
	}
	if (h == 0)
	{
	System.out.print("No");
	}
	}
}

