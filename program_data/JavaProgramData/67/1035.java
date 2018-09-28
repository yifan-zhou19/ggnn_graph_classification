package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int Total;
		int Well;
	 float standard;
	 float temp;
	 String[] a = {"better", "same", "worse"};
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 Total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 Well = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 standard = Well / (float)Total;
	 for (int i = 0;i < n - 1;i++)
	 {
		 Total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 Well = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  temp = Well / (float)Total;
	  if (temp - standard > 0.05F)
	  {
	   System.out.print(a[0]);
	   System.out.print("\n");
	  }
	  else if (temp - standard < -0.05F)
	  {
	   System.out.print(a[2]);
	   System.out.print("\n");
	  }
	  else
	  {
	   System.out.print(a[1]);
	   System.out.print("\n");
	  }
	 }
	 return 0;
	}

}

