package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int n;
		int m;
		int i;
		int j;
		int k;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a[1] = n / 100;
	  n = n % 100;
	  a[2] = n / 50;
	  n = n % 50;
	  a[3] = n / 20;
	  n = n % 20;
	  a[4] = n / 10;
	  n = n % 10;
	  a[5] = n / 5;
	  n = n % 5;
	  a[6] = n;
	  for (i = 1;i <= 6;i++)
	  {
		   System.out.print(a[i]);
		   System.out.print("\n");
	  }

	  return 0;


	}

}

