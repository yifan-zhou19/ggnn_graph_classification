package <missing>;

public class GlobalMembers
{
	public static String input = new String(new char[150]);
	public static String output = new String(new char[150]);
	public static int Main()
	{
			int n;
			int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					input = tempVar2.charAt(0);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(output,0,(Character.SIZE / Byte.SIZE));
				int count1 = 0;
				int count2 = 0;
				int i;
				for (i = 0;i < input.length();++i)
				{
					output = tangible.StringFunctions.changeCharacter(output, i, ' ');
					if (input.charAt(i) == ')')
					{
						if (count1 <= 0)
						{
							output = tangible.StringFunctions.changeCharacter(output, i, '?');
						}
						else
						{
							count1--;
						}
					}
					else if (input.charAt(i) == '(')
					{
						count1++;
					}
				}
				for (i = input.length();i >= 0;--i)
				{
					if (input.charAt(i) == '(')
					{
						if (count2 <= 0)
						{
							output = tangible.StringFunctions.changeCharacter(output, i, '$');
						}
						else
						{
							count2--;
						}
					}
					else if (input.charAt(i) == ')')
					{
						count2++;
					}
				}
				System.out.printf("%s\n%s\n",input,output);
			}
			return 0;
	}
}

