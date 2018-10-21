package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[70000];
	public static int Main()
	{
		int n;
		int k;
		int[] c = new int[1001];
		int i;
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			a[c[i] + 32768] = 1;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[c[i] + 32768] != 0 && a[k - c[i] + 32768] != 0)
			{
				break;
			}
		}
		if (i < n)
		{
			System.out.print("yes");
		}
		 else
		 {
			 System.out.print("no");
		 }
	}
}

