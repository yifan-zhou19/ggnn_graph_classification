package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000001];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				System.out.printf("%d",a[i]);
				break;
			}
		}
		for (j = i + 1;j < n;j++)
		{
			while ((a[j] != k) && (j < n))
			{
				System.out.printf(" %d",a[j]);
				j++;
			}
			if (a[j] == k)
			{
				continue;
			}
		}
		return 0;
	}







}

