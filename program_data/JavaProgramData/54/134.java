package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int apple;
		int a;
		int i;
		int p;
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
		for (a = 1;;a++)
		{
			p = 0;
			apple = a * n + k;
			 for (i = 1;i <= n - 1;i++)
			 {
				if (apple % (n - 1) != 0)
				{
					break;
				}
				else
				{
					apple = apple * n / (n - 1) + k;
					p++;
				}
			 }
			 if (p == n - 1)
			 {
				 break;
			 }
		}
		System.out.printf("%d",apple);
		System.in.read();
		System.in.read();
	}

}

