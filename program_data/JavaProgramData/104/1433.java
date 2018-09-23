package <missing>;

public class GlobalMembers
{
	public static int path(int m,int n)
	{
										   //??????m,n???? 
	  if (m == n) //??????????
	  {
		return m;
	  }
	  if (m > n)
	  {
		 m = m / 2;
	  }
	  else if (m < n)
	  {
	  n = n / 2; //??????????????????
	  }
	  return path(m, n); //?? ????
	}
	public static int Main()
	{
	  int x;
	  int y;
	  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.out.print(path(x, y));

	return 0;
	}

}

