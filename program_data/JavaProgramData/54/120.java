package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int m;
		int i;
		int j;
		int tf;
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
		for (j = 1;j < 2147483647;j++)
		{
			tf = 1;
		 m = j * n + k;
		 for (i = 2;i <= n;i++)
		 {
			if (m % (n - 1) != 0)
			{
				tf = 0;
				break;
			}
			m = m * n / (n - 1) + k;
		 }
		 if (tf == 0)
		 {
			 continue;
		 }
		 break;
		}
		System.out.printf("%d\n",m);
	}
}

