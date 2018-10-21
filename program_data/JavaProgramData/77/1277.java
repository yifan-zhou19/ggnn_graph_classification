package <missing>;

public class GlobalMembers
{
	public static char a;
	public static int find(int i)
	{
		char c;
		int j = i + 1;
		while (true)
		{
			c = System.in.read();
			if (c == a)
			{
				j = find(j) + 1;
			}
			else
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				if (i != 0)
				{
					System.out.print("\n");
				}
				break;
			}
		}
		return j;
	}
	public static int Main()
	{
		a = System.in.read();
		find(0);
		return 0;
	}
}
