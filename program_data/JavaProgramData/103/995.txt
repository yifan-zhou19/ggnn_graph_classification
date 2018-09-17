package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***?????????***
	//***??????***
	//***???2013.1.13***
	//*************************************************
	public static int Main()
	{
		String a = new String(new char[1001]);
		char t;
		int num;
		int i = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		t = a.charAt(0);
		num = 1;
		while (a.charAt(i++) != '\0')
		{
			if (a.charAt(i) == a.charAt(i - 1) || Math.abs(a.charAt(i) - a.charAt(i - 1)) == 'a' - 'A')
			{
				num++;
			}
			else
			{
				if (a.charAt(i - 1) >= 'a' && a.charAt(i - 1) <= 'z')
				{
					a.charAt(i - 1) += 'A' - 'a';
				}
				System.out.print("(");
				System.out.print(a.charAt(i - 1));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
				num = 1;
				t = a.charAt(i);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

