package <missing>;

public class GlobalMembers
{
	/* title :????*
	* author : ???*
	* time : 2011.11.9 */


	public static String c = new String(new char[100]);
	public static char boy;
	public static int n;
	public static int current;

	public static int tell(int num)
	{
		int num2;
		if (num == n - 1)
		{
			return num;
		}
		if (c.charAt(num) == boy)
		{
			num2 = tell(num + 1);
			while (num2 == -1)
			{
				num2 = tell(current + 1);
			}
			System.out.print(num);
			System.out.print(" ");
			System.out.print(num2);
			System.out.print("\n");
			return -1;
		}
		else
		{
			current = num;
			return num;
		}
	}


	public static int Main()
	{
		int m;
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = c.charAt(0);
		n = c.length();
		m = tell(0);
		return 0;
	}


}

