package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int k;
	  int i;
	  int temp;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int applestay;
	  i = 0;
	  for (applestay = n - 1;i < n;applestay = applestay + (n - 1))
	  {
	  i = 0;
	  temp = applestay;
	   for (;i < n;i++)
	   {
			if (n * temp % (n - 1) != 0)
			{
				break;
			}
		  temp = n * temp / (n - 1) + k;
	   }
	  }
	 System.out.print(temp);
	return 0;
	}
}

