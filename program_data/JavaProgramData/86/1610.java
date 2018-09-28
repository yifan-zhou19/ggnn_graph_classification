package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int[] a = new int[100];
	 int m;
	 int time;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == 0)
		{
			System.out.print(60);
		}
		else
		{
		  for (j = 0;j < m;j++)
		  {
			a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		  }
		 for (j = 0;j < m;j++)
		 {
			  time = 3 * j + a[j];
			  if (time+3 >= 60)
			  {
			   if (time <= 60)
			   {
				  System.out.print(a[j]);
				  break; //??break?????????
			   }
			   time = 3 * (j - 1) + a[j - 1];


			   break;
			  }
		 }
		   if (time+3 < 60)
		   {
		   System.out.print(60 - 3 - time + a[j - 1]);
		   }
		}
	   System.out.print("\n");

	 }

	 return 0;
	}

}

