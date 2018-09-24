package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int temp = 0;
		int i = 0;
		int j;
		int[] a = new int[100];
		while (n != 0)
		{
					  a[i] = n % 10;
					  i++;
					  n /= 10;
		}
		j = i;
		for (i = 0;i < j;i++)
		{
						   temp = temp * 10 + a[i];
		}
		return temp;
	}
	public static int Main()
	{
		  int g;
		  int n;
		  for (g = 0;g < 6;g++)
		  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  n = Integer.parseInt(tempVar);
						  }
						  System.out.printf("%d\n",reverse(n));
		  }

	}

}

