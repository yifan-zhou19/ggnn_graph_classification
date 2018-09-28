package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int max = 0;
	 int t = 0;
	 int a;
	 int b;
	 for (int i = 1;i <= n;i++)
	 {
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
	  {
	   t++;
	  }
	  else if (t != 0)
	  {
		   max = t > max != 0?t:max;
		   t = 0;
	  }
	  max = t > max != 0?t:max;
	 }
	 System.out.print(max);
	 return 0;
	}
}

