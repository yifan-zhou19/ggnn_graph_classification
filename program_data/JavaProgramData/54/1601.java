package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int k;
		int i;
		int j;
		int c;
		int a;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (j = 1;;j++)
		 {
			 c = j;
		  for (i = 1;i <= n;i++)
		  {
			   a = (c * n) + k;
			if (i != n)
			{
				 if (a % (n - 1) == 0)
				 {
					 c = a / (n - 1);
				 }
			   else
			   {
				   break;
			   }
			}
				 else
				 {
					 m = a;
				 }
		  }
			 if (m != 0)
			 {
				 System.out.print(m);
				 System.out.print("\n");
				 break;
			 }
		 }

	return 0;
	}


}

