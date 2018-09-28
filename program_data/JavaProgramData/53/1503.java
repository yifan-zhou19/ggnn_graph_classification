package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	for (int i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		for (int j = 0;j < i;j++)
		{
			if (a[i] == a[j])
			{
			i--;
			n--;
			break;
			}
		}
	}
	System.out.printf("%d",a[0]);
	for (int i = 1;i < n;i++)
	{
		System.out.printf(",%d",a[i]);
	}
	}

}

