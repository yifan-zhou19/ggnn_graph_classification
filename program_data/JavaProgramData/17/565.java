package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int left;
		int right;
		int[] pos = new int[101];
		int[] pos1 = new int[101];
		int i;
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			left = right = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(pos, 0, (Integer.SIZE / Byte.SIZE));
			System.out.print(a);
			System.out.print("\n");
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				if (a.charAt(i) == '(')
				{
					left++;
					pos[left] = i;
				}
				if (a.charAt(i) == ')')
				{
					if (left == 0)
					{
						right++;
						pos1[right] = i;
					}
					else
					{
						pos[left] = 200;
						left--;
					}
				}
			}
			for (i = 1; i <= left; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, pos[i], 1);
			}
			for (i = 1; i <= right; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, pos1[i], 2);
			}
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				if (a.charAt(i) != 1 && a.charAt(i) != 2)
				{
					System.out.print(" ");
				}
				else
				{
					if (a.charAt(i) == 1)
					{
						System.out.print("$");
					}
					else
					{
						System.out.print("?");
					}
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

