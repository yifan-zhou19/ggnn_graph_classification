package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 for (int j = 0;j < 100000;j++)
	 {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (n == 0 && m == 0)
		{
			break;
		}
		int a = 0;
		for (i = 2;i <= n;i++)
		{
				a = ((m % i) + a) % i;
		}
			a++;
		System.out.printf("%d\n",a);
	 }
		return 0;
	}


}

