package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			char a;
			char b;
			int i = 1;

			b = 60;
			for (;i > 0;i++)
			{
					a = System.in.read();
					if (a == '\n')
					{
						break;
					}
					if (a != ' ' || b != ' ')
					{
						System.out.print(a);
					}
					b = a;
			}
			return 0;
	}

}
