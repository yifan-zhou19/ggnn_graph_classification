package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int j;
		int k = 0;
		int[] a = new int[1000];
		for (i = 0;;i++)
		{
					 a[i] = n % 10;
					 n = n / 10;
					 if (n == 0)
					 {
						 break;
					 }
		}
		j = i;
		for (i = 0;i <= j;i++)
		{
					 k = k * 10 + a[i];
		}
		return k;
	}
	public static int Main()
	{
		  int i;
		  int n;
		  int k;
		  for (i = 0;i < 6;i++)
		  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  n = Integer.parseInt(tempVar);
						  }
						  k = reverse(n);
						  System.out.printf("%d\n",k);
		  }
	}




}

