package <missing>;

public class GlobalMembers
{
	public static int reverse(int t)
	{
	  int flag = 1;
	  if (t == 0)
	  {
		  return 0;
	  }
	  if (t < 0)
	  {
		flag = -1;
		t = -t;
	  }
	  int ans = 0;
	  while (t != 0)
	  {
		ans *= 10;
		ans += t % 10;
		t /= 10;
	  }
	  return ans * flag;
	}
	public static int Main()
	{
	  for (int i = 0;i < 6;i++)
	  {
		int t = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(reverse(t));
		System.out.print("\n");
	  }
	  return 0;
	}

}

