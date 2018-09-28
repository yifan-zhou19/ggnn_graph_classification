package <missing>;

public class GlobalMembers
{
	public static int zh(int x,int y)
	{
		if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
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
	int i;
	int j;
	int p = 0;
	int[] a = new int[300];
	int[] b = new int[300];
	int n;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if ((zh(a[0], b[0]) == 1) || (zh(a[i], b[i]) == 1 && zh(a[i - 1], b[i - 1]) != 1))
		{
			j = i;
			while (zh(a[j], b[j]) != 0)
			{
				j++;
			}
			if (p < j - i)
			{
				p = j - i;
			}
		}
	}
	System.out.printf("%d",p);
	return 0;
	}

}

