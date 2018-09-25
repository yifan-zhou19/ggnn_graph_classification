package <missing>;

public class GlobalMembers
{
	//??????????????????????....???strlen???????????????...???????????= =
	public static int Main()
	{
		String a = new String(new char[45]);
		int m; //m?????n????
		int n;
		int count = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = m + 1; //??n???
		for (int i = 1;i <= m;i++)
		{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (count == 0)
			{
					System.out.print(a);
				count = a.length();
			}
			else if (count + a.length() + 1 < 80)
			{
			System.out.print(" ");
			System.out.print(a);
			count = count + a.length() + 1;
			}
			else if (count + a.length() + 1 == 80)
			{
			System.out.print(" ");
			System.out.print(a);
			System.out.print("\n");
			count = 0;
			}
			else
			{
				 System.out.print("\n");
				 System.out.print(a);
				 count = a.length();
			}
		}
		return 0;
	}
}

