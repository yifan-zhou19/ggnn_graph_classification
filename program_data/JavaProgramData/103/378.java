package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int[] flag = new int[1000];
		int i = 0;
		int j;
		int[] sum = new int[1000];
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0; i < str.length(); i++)
		{
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
		}
		i = 0;
		while (i < str.length())
		{
			if (flag[i] == 0)
			{
				for (j = i + 1;;j++)
				{
					if (str.charAt(j) == str.charAt(i))
					{
						sum[i]++;
						flag[j] = 1;
					}
					else
					{
						break;
					}
				}
				i = j;
			}
			else
			{
				i++;
			}
		}
		for (i = 0; i < str.length(); i++)
		{
			if (flag[i] == 0)
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(sum[i] + 1);
				System.out.print(")");
			}
		}
		return 0;
	}


}

