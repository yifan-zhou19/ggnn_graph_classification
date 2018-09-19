package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int k = 0;
		int[] a = new int[6];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
		  a[i] = (n % 10);
		  n = (n - a[i]) / 10;
		  i++;
		  k++;
		}while (n != 0);
		  for (i = 0;i < k;i++)
		  {
		  System.out.print(a[i]);
		  }
		return 0;
	}


}

