package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		l = 0;
		a = 2;
		for (a = 2;(a + 2) <= n;a++)
		{
				b = a + 2;
				for (i = 2;i * i <= b;i++)
				{
					 if (a % i == 0 || b % i == 0)
					 {
						 k++;
					 }
				}
				if (k == 0)
				{
				System.out.printf("%d %d\n",a,b);
				l++;
				}
				k = 0;
		}
		if (l == 0)
		{
		System.out.print("empty");
		}
	}
}

