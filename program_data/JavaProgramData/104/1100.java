package <missing>;

public class GlobalMembers
{
	public static int[] N = new int[MAX];

	public static int x_iter(int x)
	{
	  if (N[x - 1] == 1)
	  {
		  return x;
	  }
	  else
	  {
		N[x - 1] = 1;
		x_iter(x / 2);
	  }
	}

	public static int Main()
	{
	  int x;
	  int y;
	  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(N,0,(Integer.SIZE / Byte.SIZE));
	  x_iter(x);
	  System.out.print(x_iter(y));
	  return 0;
	}
}

