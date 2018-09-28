package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[3000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 2;
		int i;
		int j;
		int k = 0;
		int t = 1;
		for (j = 3;j <= n;j++)
		{
			for (i = 2;i <= j / 2;i++)
			{
				if (j % i == 0)
				{
					k++;
					break;

				}
			}
		if (k == 0)
		{
			a[t] = j;
			t++;
		}
		k = 0;
		}
	   for (i = 1;i < t;i++)
	   {
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n", a[i],a[i + 1]);
			}
	   }
	   if (t == 1 || t == 2)
	   {
		   System.out.print("empty");
	   }
	}

}

