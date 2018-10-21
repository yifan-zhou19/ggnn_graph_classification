package <missing>;

public class GlobalMembers
{
	public static int n; //n?????high,low????????????????,s??????????????ans???
	public static int high;
	public static int low;
	public static int s;
	public static int ans;
	public static int Main()
	{
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (;n--;) //??n?
	  {
		high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (90 <= high != 0 && high <= 140 && 60 <= low != 0 && low <= 90) //??
		{
		  ++s; //?????????
		  if (s > ans) //????
		  {
			ans = s;
		  }
		}
		else //???
		{
		  s = 0; //?????????
		}
	  }
	  System.out.print(ans);
	  System.out.print("\n");
	  return 0;
	}

}

