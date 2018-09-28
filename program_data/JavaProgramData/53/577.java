package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int n;
	int i;
	int j;
	int t = 0;
	int v = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;;i++)
	{
	t++;
	if (t == n + 1)
	{
		break;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < i;j++)
	{
		if (a[j] == a[i])
		{
			break;
		}
	}
	j == i != 0?v++:i--;
	}
	for (i = 0;i < v;i++)
	{
	System.out.printf("%d",a[i]);
	if (i != v - 1)
	{
		System.out.print(",");
	}
	}
	}

}

