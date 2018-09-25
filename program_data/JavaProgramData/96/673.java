package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????13   **
	//*?????? 1200012837 **
	//*???2012.11.12  **
	//********************************

	public static int Main()
	{
		int i;
		int q = 0;
		int r;
		int len;
		String n = new String(new char[110]);
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = n.length();
		if (len > 1)
		{
			q = ((n.charAt(0) - '0') * 10 + (n.charAt(1) - '0')) / 13;
			r = ((n.charAt(0) - '0') * 10 + (n.charAt(1) - '0')) % 13; //???????????0
			if (q != 0 || len == 2)
			{
				System.out.print(q);
			}
			for (i = 1;i < len - 1;i++) //??????i?<len-1?
			{
				q = (r * 10 + (n.charAt(i + 1) - '0')) / 13; //??
				r = (r * 10 + (n.charAt(i + 1) - '0')) % 13; //???

				System.out.print(q);
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}
		else
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(n.charAt(0));
			System.out.print("\n");
		}

		return 0;
	}

}

