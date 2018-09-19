package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int len = 0;
	 int[] temp = new int[6];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		System.out.print(n);
	}
	 while (n > 0)
	 {
	  temp[len++] = n % 10;
	   n = n / 10;
	 }
	  for (int i = 0;i < len;i++)
	  {
	  System.out.print(temp[i]);
	  }
	  return 0;
	}
}

