package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000000];
		int i;
		int j;
		int c = 0;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[c] = a[i] + a[j];
				c++;
			}
		}
		for (i = 0;i <= c;i++)
		{
			if (b[i] == k)
			{
				p = 1;
				break;
			}
			else
			{
				p = 2;
			}
		}
		if (p == 1)
		{
			System.out.print("yes\n");
		}
		else if (p == 2)
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

