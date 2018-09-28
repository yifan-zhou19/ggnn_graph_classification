package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] a = new int[1000];
		int c = 0;
		int s;
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
		}
		for (i = c;i < n;i++)
		{
			s = a[c] + a[i];
			if (s == k)
			{
				System.out.print("yes");
				break;
			}
			if (i == n - 1)
			{
				c = c + 1;
				i = c;
			}
			if (c == n - 1)
			{
				System.out.print("no");
				break;
			}
		}
		return 0;
	}
}

