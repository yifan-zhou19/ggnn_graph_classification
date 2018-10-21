package <missing>;

public class GlobalMembers
{
	public static String children = new String(new char[101]);
	public static char boy;

	public static int f(int i)
	{
	  if (children.charAt(i) == boy)
	  {
		int girlPos = f(i + 1);
		System.out.print(i);
		System.out.print(' ');
		System.out.print(girlPos);
		System.out.print("\n");
		if (i != 0)
		{
		  return f(girlPos + 1);
		}
		else
		{
		  return 0;
		}
	  }
	  return i;
	}

	public static int Main()
	{
	  children = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  boy = children.charAt(0);
	  f(0);

	  return 0;
	}

}

