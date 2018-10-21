package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j = 0;
		int sum = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
		  if (i % 7 != 0 && (i - 7) % 10 != 0 && i / 10 != 7)
		  {
		  a[j] = i;
		  j++;
		  }
	  }
	  for (i = 0;i < j;i++)
	  {
		  sum = sum + a[i] * a[i];
	  }
	  System.out.print(sum);
	  System.out.print("\n");


		return 0;
	}


}

