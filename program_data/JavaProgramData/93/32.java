package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x % (3 * 5 * 7) == 0)
		{
			System.out.printf("%c%c%c%c%c",'3',' ','5', ' ','7');
		}
			else if (x % (3 * 5) == 0)
			{
				System.out.printf("%c%c%c", '3',' ','5');
			}
			else if (x % (5 * 7) == 0)
			{
				System.out.printf("%c%c%c", '5',' ','7');
			}
			else if (x % (3 * 7) == 0)
			{
				System.out.printf("%c%c%c", '3',' ','7');
			}
			else if (x % 3 == 0)
			{
				System.out.printf("%c", '3');
			}
			else if (x % 5 == 0)
			{
				System.out.printf("%c", '5');
			}
			else if (x % 7 == 0)
			{
				System.out.printf("%c", '7');
			}
			else
			{
				System.out.printf("%c", 'n');
			}
	}


}

