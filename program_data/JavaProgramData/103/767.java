package <missing>;

public class GlobalMembers
{
	public static String A = new String(new char[1000]);
	public static int Main()
	{
		A = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = A.length();
		int num;
		for (int i = 0;i < len;i++)
		{
			if (i == 0)
			{
				num = 1;
			}

			else
			{


				if (A.charAt(i) == A.charAt(i - 1) || A.charAt(i) - 'A' == A.charAt(i - 1) - 'a' || A.charAt(i) - 'a' == A.charAt(i - 1) - 'A')
				{
					num++;
				}
				else
				{
					if (A.charAt(i - 1) >= 'A' && A.charAt(i - 1) <= 'Z')
					{
					System.out.print('(');
					System.out.print(A.charAt(i - 1));
					System.out.print(',');
					System.out.print(num);
					System.out.print(')');
					}
					else
					{
						char p = 'A' + A.charAt(i - 1) - 'a';
						System.out.print('(');
						System.out.print(p);
						System.out.print(',');
						System.out.print(num);
						System.out.print(')');
					}
					num = 1;

				}


			}
			if (i == len - 1)
			{
				if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z')
				{
					System.out.print('(');
					System.out.print(A.charAt(i));
					System.out.print(',');
					System.out.print(num);
					System.out.print(')');
				}
					else
					{
						char p = 'A' + A.charAt(i) - 'a';
						System.out.print('(');
						System.out.print(p);
						System.out.print(',');
						System.out.print(num);
						System.out.print(')');
					}
			}

		}

		return 0;
	}


}

