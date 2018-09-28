package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[9];
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n;
		for (i = 0;i < 9;i++)
		{
			a[i] = k % 10;
			k = k / 10;
		}
		  for (i = 1;i < 9;i++)
		  {
			a[i] = a[i - 1] * 10 + a[i];
		  }
		k = a[8];
			while (k % 10 == 0)
			{
			  k = k / 10;
			}
			System.out.printf("%d",k);
	}
}

