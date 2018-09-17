package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		char s;
		char temp = null;
		int i;
		int sum;
		for (i = 0; i < 1000; i++)
		{
			cin.get(s);
			if (s == '\n')
			{
				System.out.print(sum);
				System.out.print(")");
				System.out.print("\n");
				break;
			}
			else
			{
				if (s - 'a' >= 0 && s - 'a' <= 26)
				{
					s = 'A' + s - 'a';
				}
				if (temp != s)
				{
					if (temp != null)
					{
						System.out.print(sum);
						System.out.print(")(");
						System.out.print(s);
						System.out.print(",");
					}
					else
					{
						System.out.print("(");
						System.out.print(s);
						System.out.print(",");
					}
					temp = s;
					sum = 1;
				}
				else
				{
					sum++;
				}
			}
		}
		return 0;
	}
}
