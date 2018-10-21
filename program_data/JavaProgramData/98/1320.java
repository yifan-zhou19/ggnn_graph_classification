package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String verb = new String(new char[42]);
		char m;
		int num;
		int size;
		int sum = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			verb = ConsoleInput.readToWhiteSpace(true).charAt(0);
			m = System.in.read();
			size = verb.length();
			if (sum == 0)
			{
				System.out.print(verb);
				sum += size;
			}
			else
			{
				sum += (size + 1);
				if (sum <= 80)
				{
					System.out.print(" ");
					System.out.print(verb);
				}
				else
				{
					System.out.print("\n");
					System.out.print(verb);
					sum = size;
				}
			}
			if (m == '\n')
			{
				break;
			}
		}
		return 0;
	}





}

