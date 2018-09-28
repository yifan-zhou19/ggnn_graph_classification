package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int i;
	int j;
	int m;
	int n = 0;
	int t;
	int z = 1;
	int max;
	char s;
	for (i = 0;;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	if (s != ',')
	{
		break;
	}
	else
	{
		n++;
	}
	}
	m = a[0];
	for (i = 0;i < n;i++)
	{
	if (m != a[i])
	{
		z = 0;
		break;
	}
	}
	if (n == 1 || z == 1)
	{
		System.out.print("No");
	}
	else
	{
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n - i;j++)
	{
	if (a[j] < a[j + 1])
	{
		t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
	}
	}
	}
	max = a[0];
	for (i = 0;;i++)
	{
		if (a[i] < max)
		{
		System.out.printf("%d",a[i]);
		break;
		}
	}
	}
	}
}

