package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int i;
	int j = 0;
	int k;
	int n;
	int m = 0;
	char b;
	for (i = 0;i < 300;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	j++;
	if (b == '\n')
	{
		break;
	}
	}
	if (j != 1)
	{
	for (k = 0;k < j - 1;k++)
	{
	for (i = k;i < j;i++)
	{
	if (a[k] < a[i])
	{
	n = a[k],a[k] = a[i],a[i] = n,m = m + 1;
	}
	}
	}
	if (m == 0 && i > 0)
	{
	System.out.print("No");
	}
	if (m != 0)
	{
	for (i = 0;i < j - 1;i++)
	{
	if (a[i] != a[i + 1] && a[i + 1] != 0)
	{
	break;
	}
	}
	System.out.printf("%d",a[i + 1]);
	}

	}
	if (j == 1)
	{
	System.out.print("No");
	}
	}









}

