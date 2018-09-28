package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int now;
	int[] a = new int[100];
	int j = 1;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	for (i = 1;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		now = Integer.parseInt(tempVar3);
	}
	for (s = 0;s < j;s++)
	{
			if (now == a[s])
			{
				break;
			}
			if (now != a[s] && (s == j - 1))
			{
				a[j] = now;
				j++;
			}
	}
	}
	for (i = 0;i < j - 1;i++)
	{
	System.out.printf("%d,",a[i]);
	}
	System.out.printf("%d",a[j - 1]);
	}
}

