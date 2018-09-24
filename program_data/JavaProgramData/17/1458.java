package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] flag = new int[101];
		String str = new String(new char[101]);
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		for (i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
			if (str.charAt(i) == ')')
			{
				for (j = i; j >= 0; j--)
				{
					if (str.charAt(j) == '(' && flag[j] == 0)
					{
						flag[i] = 1;
						flag[j] = 1;
						break;
					}
				}
			}
		}
		System.out.print("\n");
		for (i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == '(' && flag[i] == 0)
			{
				System.out.print("$");
			}
			else if (str.charAt(i) == ')' && flag[i] == 0)
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag,0,(Integer.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

