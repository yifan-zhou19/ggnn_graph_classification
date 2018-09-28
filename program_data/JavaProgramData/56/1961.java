package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int sum;
		  int i;
		  int n;
		  int[] a = new int[6];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  sum = Integer.parseInt(tempVar);
		  }

		  n = (int)(Math.log(sum) / Math.log(10)) + 1;
		  for (i = 1;i <= n; i++)
		  {
				a[i] = (sum / (int)Math.pow(10, i - 1)) % 10;

		  }

		  for (i = n;i >= 1;i--)
		  {
				System.out.printf("%d", a[n + 1 - i]);
		  }
	}

}

