package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] word = new int[3];
		for (a = 1;a < 4;)
		{
			for (b = 1;b < 4;)
			{
				if (b == a)
				{
					b = b + 1;
				}
				c = 6 - a - b;
				word[0] = (b > a) + (c == a);
				word[1] = (a > b) + (a > c);
				word[2] = (c > b) + (b > a);
				if ((a > b) && (b > c) && (word[2] > word[1]) && (word[1] > word[0]))
				{
					System.out.print("CBA");
					System.out.print("\n");
				}
				if ((a > c) && (c > b) && (word[1] > word[2]) && (word[2] > word[0]))
				{
					System.out.print("BCA");
					System.out.print("\n");
				}
				if ((b > a) && (a > c) && (word[2] > word[0]) && (word[0] > word[1]))
				{
					System.out.print("CAB");
					System.out.print("\n");
				}
				if ((b > c) && (c > a) && (word[0] > word[2]) && (word[2] > word[1]))
				{
					System.out.print("ACB");
					System.out.print("\n");
				}
				if ((c > a) && (a > b) && (word[1] > word[0]) && (word[0] > word[2]))
				{
					System.out.print("BAC");
					System.out.print("\n");
				}
				if ((c > b) && (b > a) && (word[0] > word[1]) && (word[1] > word[2]))
				{
					System.out.print("ABC");
					System.out.print("\n");
				}
				b = b + 1;
			}
			a = a + 1;
		}
		return 0;
	}
}
