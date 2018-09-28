package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000000];
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i != j)
				{
				c[e] = a[i] + b[j];
				e++;
				}
			}
		}
		for (i = 0;i <= e;i++)
		{
			if (i < e && c[i] == k)
			{
				System.out.print("yes\n");
				break;
			}
			if (i == e && c[e] == k)
			{
				System.out.print("yes\n");
			}
			else if (i == e)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

