package <missing>;

public class GlobalMembers
{
	// ????
	//????wayne
	//?????12.30


	public static String a = new String(new char[41]);

	public static int Main()
	{
		int cnt = 0;
		int n;
		int i;
		int length;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(a);
		cnt = a.length();
		for (i = 1;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			length = a.length();
			cnt++;
			cnt += length;
			if ((cnt) <= 80)
			{
				System.out.print(" ");
				System.out.print(a);
			}
			else
			{
				System.out.print("\n");
				System.out.print(a);
				cnt = a.length();
			}
		}
		return 0;
	}


}

