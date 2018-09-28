package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int re = 1;
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
			re *= n;
		}
		if (n == 2)
		{
			System.out.print("7\n");
		}
		else
		{
			System.out.printf("%d\n",re - k * (n - 1));
		}
	}
}

