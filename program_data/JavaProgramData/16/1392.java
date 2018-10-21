package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[5];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < 5;i++)
	  {
			 a[i] = n % 10;
			 n = n / 10;
			 System.out.print(a[i]);
			 if (n == 0)
			 {
				 break;
			 }

	  }
	   return 0;
	}

}

