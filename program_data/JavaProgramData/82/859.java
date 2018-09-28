package <missing>;

public class GlobalMembers
{
	/*
	  Name: ??(5-5) ????
	  Author: 120012757(chenminhuan)
	  Date: 15/10/12 18:28
	*/

	public static int n;
	public static int ans;
	public static int cnt;
	public static int a;
	public static int b;
	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ans = 0; // answer
		cnt = 0;
		while (n-- != 0)
		{
			  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			  {
				  cnt++;
			  }
			  else
			  {
				  if (cnt > ans)
				  {
					  ans = cnt;
				  }
				  cnt = 0;
			  }
		}
		if (cnt > ans)
		{
			ans = cnt;
		}
		System.out.print(ans);
		System.out.print("\n");
		return 0;
	}
}

