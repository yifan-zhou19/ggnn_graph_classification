package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] know = new int[10000];
		int[] known = new int[10000];
		int flag;
		int man;
		int man0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			man = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			man0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (man == 0 && man0 == 0)
			{
				break;
			}
			++know[man];
			++known[man0];
		} while (1 != 0);
		flag = 0;
		for (int i = 0; i < n; i++)
		{
			if (know[i] == 0 && known != 0)
			{
				System.out.print(i);
				System.out.print("\n");
				++flag;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

