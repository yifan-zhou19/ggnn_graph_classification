package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int j;
		int sum = 0;
		int t = 10;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
			 ;
			}
		 else
		 {
				 if (i % 10 == 7)
				 {
				 ;
				 }
			  else
			  {
					 j = i / t;
				 if (j % 10 == 7)
				 {
					 ;
				 }
				 else
				 {
					 sum = sum + i * i;
				 }
			  }
		 }
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

