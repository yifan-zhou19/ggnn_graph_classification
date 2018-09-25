package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len = 0;
		int i = 0;
		int j = 0;
		int sum = 0;
		String in = new String(new char[101]);
		int[] sign = new int[101];
		String out = new String(new char[101]);
		while ((in = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			len = in.length();
			for (i = 0;i < len;i++)
			{
				sign[i] = 0;
			}
			for (i = 0;i < len;i++)
			{
				out = tangible.StringFunctions.changeCharacter(out, i, ' ');
			}
			out = tangible.StringFunctions.changeCharacter(out, len, '\0');
			for (i = 0;i < len;i++)
			{
				sum = 1;
				if (in.charAt(i) == '(')
				{
					if (i == len - 1)
					{
						out = tangible.StringFunctions.changeCharacter(out, i, '$');
					}
					else
					{
						 for (j = i + 1;j < len;j++) //??sum=0?????????????????????????????
						 {

								if (in.charAt(j) == '(')
								{
									sum = sum + 1;
								}
								if (in.charAt(j) == ')')
								{
									sum = sum - 1;
								}
								if (sum == 0)
								{
									sign[j] = 1;
									break;
								}
						 }
					if (sum != 0)
					{
						out = tangible.StringFunctions.changeCharacter(out, i, '$');
					}
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (in.charAt(i) == ')' && sign[i] == 0)
				{
					out = tangible.StringFunctions.changeCharacter(out, i, '?');
				}
			}
				System.out.print(in);
				System.out.print("\n");
				System.out.print(out);
				System.out.print("\n");

		}
		return 0;
	}
	//????????????????????????????????

}

