package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			String s = new String(new char[105]);
			String a = new String(new char[105]);
			int i;
			int k = 0;
			int[] stack = new int[105];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,' ',(Character.SIZE / Byte.SIZE));
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '(')
				{
					stack[k++] = -i - 1;
				}
				else if (s.charAt(i) == ')')
				{
					if (k == 0 || stack[k - 1] > 0)
					{
						stack[k++] = i + 1;
					}
					else
					{
						k--;
					}
				}
			}
			for (i = 0;i < k;i++)
			{
				if (stack[i] > 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, stack[i] - 1, '?');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, -stack[i] - 1, '$');
				}
			}
			a = tangible.StringFunctions.changeCharacter(a, s.length(), '\0');
			System.out.print(s);
			System.out.print("\n");
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}


}

