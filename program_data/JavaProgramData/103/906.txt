package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1005]);
		char temp;
		int length = 1;
		int i = 1;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n;
		n = str.length();
		for (i = 1;i < n;i++)
		{
			if ((str.charAt(i) - str.charAt(i - 1) == 0) || (str.charAt(i) - str.charAt(i - 1) == 32) || (str.charAt(i) - str.charAt(i - 1) == -32)) //????????????????????????????
			{
				length++;
			}
			else
			{
				if (str.charAt(i - 1) < 95) //??
				{
					System.out.print("(");
					System.out.print(str.charAt(i - 1));
					System.out.print(",");
					System.out.print(length);
					System.out.print(")");
				}
				else //??
				{
					temp = str.charAt(i - 1) - 32;
					System.out.print("(");
					System.out.print(temp);
					System.out.print(",");
					System.out.print(length);
					System.out.print(")");
				}
				length = 1;
			}
		}
		//????????????1???1?
		if (str.charAt(n - 1) < 95) //??
		{
			System.out.print("(");
			System.out.print(str.charAt(n - 1));
			System.out.print(",");
			System.out.print(length);
			System.out.print(")");
		}
		else //??
		{
			temp = str.charAt(n - 1) - 32;
			System.out.print("(");
			System.out.print(temp);
			System.out.print(",");
			System.out.print(length);
			System.out.print(")");
		}
		return 0;
	}
}

