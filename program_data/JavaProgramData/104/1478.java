package <missing>;

public class GlobalMembers
{
	//&#202;&#181;&#214;&#202;&#201;&#207;&#202;&#199;&#193;&#189;&#184;&#246;&#182;&#254;&#189;&#248;&#214;&#198;&#202;&#253;&#163;&#172;�&#238;&#182;�&#199;�&#182;�&#201;&#217;&#206;&#187;&#207;�&#205;&#172;&#163;&#172;&#212;�&#199;�&#182;�&#201;&#217;&#206;&#187;&#182;&#212;&#211;&#166;&#181;&#196;&#182;&#254;&#189;&#248;&#214;&#198;&#202;&#253;&#188;&#180;&#206;&#170;&#203;�&#199;�
	//&#199;�&#200;�&#211;&#197;&#187;&#175; 



	public static int Main()
	{
		int x;
		int y;
		int memo;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		memo = y;
		do
		{
			do
			{
				if (x == y)
				{
					System.out.print(x);
					return 0;
				}
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
				y = y >> 1;
			} while (y != 0);
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
			x = x >> 1;
			y = memo;
		} while (x != 0);
	}
}

