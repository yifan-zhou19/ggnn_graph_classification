package <missing>;

public class GlobalMembers
{
	public static int i;
	public static String row = new String(new char[100]);
	public static int match(int x)
	{
	int y;
	if (x == i)
	{
	   return 1;
	}
	if (row.charAt(x) == row.charAt(0))
	{
	   y = match(x + 1);
	}
	   else
	   {
	   return x;
	   }
	System.out.print(x);
	System.out.print(" ");
	System.out.print(y);
	System.out.print("\n");
	return match(y + 1);
	}
	public static int Main()
	{
	row = ConsoleInput.readToWhiteSpace(true).charAt(0);
	i = row.length();
	match(0);
	return 0;
	}
}

