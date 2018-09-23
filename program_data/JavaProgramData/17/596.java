package <missing>;

public class GlobalMembers
{
	public static int a;
	public static int t = 0;
	public static final String A = "";
	public static void cal(int m)
	{
		while (t <= a)
		{
			if (A.charAt(t) == '(')
			{
				cal(t++);
			}
			 else if (A.charAt(t) == ')')
			 {
				A = tangible.StringFunctions.changeCharacter(A, m, 'a');
				A = tangible.StringFunctions.changeCharacter(A, t++, 'a');
				break;
			 }
					else
					{
						t++;
					}
		}
	}
	public static int Main()
	{
		while ((A = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			String B = new String(new char[110]);
			a = A.length() - 1;
			for (int i = 0;i <= a;i++)
			{
				B = tangible.StringFunctions.changeCharacter(B, i, A.charAt(i));
			}
			t = 0;
			while (t <= a)
			{
						if (A.charAt(t++) == '(')
						{
				cal(t - 1);
						}
			}
			for (int i = 0;i <= a;i++)
			{
				System.out.print(B.charAt(i));
			}
			System.out.print('\n');
			for (int i = 0;i <= a - 1;i++)
			{
				if (A.charAt(i) == '(')
				{
					System.out.print('$');
				}
				if (A.charAt(i) == ')')
				{
					System.out.print('?');
				}
				if (A.charAt(i) != '(' && A.charAt(i) != ')')
				{
					System.out.print(" ");
				}
			}
			if (A.charAt(a) == '(')
			{
				System.out.print('$');
				System.out.print("\n");
			}
			if (A.charAt(a) == ')')
			{
				System.out.print('?');
				System.out.print("\n");
			}
			if (A.charAt(a) != '(' && A.charAt(a) != ')')
			{
				System.out.print(" ");
				System.out.print("\n");
			}

		}
		return 0;
	}
}

