package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 0;I < N;I++)
		{
			int i;
			String in = new String(new char[110]);
			in = ConsoleInput.readToWhiteSpace(true).charAt(0);

			System.out.print(in);
			System.out.print("\n");
			int n = in.length();

			String mark = new String(new char[110]);
			for (i = 0;i < n;i++)
			{
				mark = tangible.StringFunctions.changeCharacter(mark, i, ' ');
			}

			int left = 0;

			for (i = 0;i < n;i++)
			{
				if (in.charAt(i) == '(')
				{
					left++;
				}

				else if (in.charAt(i) == ')')
				{
					if (left != 0)
					{
						left--;
					}
					else
					{
						mark = tangible.StringFunctions.changeCharacter(mark, i, '?');
					}
				}

			}

			int right = 0;
			for (i = n - 1;i >= 0;i--)
			{
				if (in.charAt(i) == ')')
				{
					right++;
				}

				else if (in.charAt(i) == '(')
				{
					if (right != 0)
					{
						right--;
					}
					else
					{
						mark = tangible.StringFunctions.changeCharacter(mark, i, '$');
					}
				}

			}

			for (i = 0;i < n;i++)
			{
				System.out.print(mark.charAt(i));
			}
			System.out.print("\n");
		}



	}


}

