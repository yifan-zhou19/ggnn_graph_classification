package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] max = new int[2];
	 int n;
	 int number;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 0;i < n;i++)
	 {
	  number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (number > max[0])
	  {
	   max[1] = max[0];
	   max[0] = number;
	  }
	  else if (number > max[1])
	  {
	   max[1] = number;
	  }
	 }
	 System.out.print(max[0]);
	 System.out.print("\n");
	 System.out.print(max[1]);
	 System.out.print("\n");
	 return 0;
	}
}

