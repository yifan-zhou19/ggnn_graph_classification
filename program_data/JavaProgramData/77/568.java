package <missing>;

public class GlobalMembers
{
	public static String line = new String(new char[100]);
	public static char boy;
	public static char girl;
	public static int len;
	public static void queue(int b)
	{

		int i = 0;
		if (b == len)
		{
			return;
		}
		else
		{
			if (line.charAt(b) == girl)
			{
				line = line.substring(0, b);
				for (i = b - 1;i >= 0;i--)
				{
					if (line.charAt(i) == boy)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(b);
						System.out.print("\n");
						line = line.substring(0, i);
						break;
					}
				}
				queue(b + 1);
			}
			else
			{
				queue(b + 1);
			}
		}
	}
	public static int Main()
	{
		line = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = line.length();
		boy = line.charAt(0);
		girl = line.charAt(len - 1);
		queue(1);
		return 0;
	}


}

