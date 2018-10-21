package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[10000];
	int i;
	int j;
	int n;
	int t;
	int count;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
		t = 0;
		count = 0;
		for (j = i;j >= 0;j--)
		{
			count++;
			if (a[i] == a[j] && (i != j))
			{
				t = 1;
			break;
			}
		}
		if (t == 0 && count == 1)
		{
			System.out.printf("%d",a[i]);
		}
		else if ((t == 0) && (count != 1))
		{
			System.out.printf(" %d",a[i]);
		}

	}
		return 0;
	}


}

