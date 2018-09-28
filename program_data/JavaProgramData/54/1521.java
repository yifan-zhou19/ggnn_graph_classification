package <missing>;

public class GlobalMembers
{
	//???????
	public static int Main()
	{
	   int[] num = new int[100];
	   int n;
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int i = 0;
	   for (int j = 0;j <= n;j++)
	   {
		   num[j] = k;
	   }

	   do
	   {
		 num[n] = num[n] + n;
		for (i = n - 1;i >= 1;i--)
		{
		  if (num[i + 1] % (n - 1) != 0)
		  {
			  break;
		  }
		  else
		  {
			  num[i] = num[i + 1] * n / (n - 1) + k;
		  }

		}
	   } while (i >= 1);
			System.out.print(num[1]);
			System.out.print("\n");

	   return 0;

	}

}

