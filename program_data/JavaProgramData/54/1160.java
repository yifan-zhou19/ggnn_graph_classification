package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int p = 1;
		int j;
		int q;
		int l = 0;
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
		 do
		 {
			j = 1;
			q = p;
			while (((q * n + k) % (n - 1) == 0) && j < n)
			{
				j++;
				q = (q * n + k) / (n - 1);
			}
			if (j == n)
			{
			System.out.printf("%d",n * q + k);
			l = 1;
			}
			p = p + 1;
		 } while (l != 1);
	return 0;
	}

}

