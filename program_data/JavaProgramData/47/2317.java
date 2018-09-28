package <missing>;

public class GlobalMembers
{
	public static void function(int len, int rem)
	{
		int num;
	  if (len > 0)
	  {
	  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  function(len - 1, rem);
		 if (len == rem)
		 {
			 System.out.print(num);
		 }
		 else
		 {
			 System.out.print(num);
			 System.out.print(" ");
		 }
	  }
	}
	public static int Main()
	{
		int len;
		int rem;
		len = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		rem = len;
		function(len, rem);

		return 0;
	}

}

