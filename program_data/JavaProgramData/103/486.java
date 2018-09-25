package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1500]);
		String string2 = new String(new char[2]);
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 0;
		int length = 0;
		int flag = 0;
		int[] a = new int[1500];
		String = new Scanner(System.in).nextLine();
		length = String.length();
		for (i = 0;i < length;i++)
		{
			a[i] = 1;
		}

		for (i = 0;i < length;i++)
		{
			if (String[i] >= 97 && string.charAt(i) <= 122)
			{
				String[i] = string.charAt(i) - 32;
			}
		}

		for (i = 1;i < length;i++)
		{
			if (String[i] == string.charAt(i - 1))
			{
				a[i] = a[i - 1] + 1;
			}
			else if (String[i] != string.charAt(i - 1))
			{
				System.out.print("(");
				System.out.print(String[i - 1]);
				System.out.print(",");
				System.out.print(a[i - 1]);
				System.out.print(")");
			}
		}
		System.out.print("(");
		System.out.print(String[length - 1]);
		System.out.print(",");
		System.out.print(a[length - 1]);
		System.out.print(")");
		System.out.print("\n");

		return 0;
	}

}
