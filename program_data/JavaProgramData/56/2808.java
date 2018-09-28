package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int y;
		y = 0;
		int t;
		t = 1;
		c = System.in.read();
		while (c != 10)
		{
			y = y + (c - 48) * t;
			t = t * 10;
			c = System.in.read();
		}
		System.out.printf("%d",y);
	}

}
