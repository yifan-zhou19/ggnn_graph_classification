package <missing>;

public class GlobalMembers
{
	public static void nixu(int k)
	{
	  if (k > 0)
	  {
		 System.out.print(k % 10);
		 k /= 10;
		 nixu(k);
	  }
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 nixu(n);
		return 0;
	}
}

