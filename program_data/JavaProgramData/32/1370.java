package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			String integer1 = new String(new char[101]);
			String integer2 = new String(new char[101]);
			String answer = new String(new char[101]);
			integer1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			integer2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(answer,'\0',(Character.SIZE / Byte.SIZE));
			int len1 = integer1.length();
			int len2 = integer2.length();
			for (int j = len1 - 1,k = len2 - 1,count = 99;j >= 0;j--,k--,count--)
			{
				if (k < 0)
				{
					answer = tangible.StringFunctions.changeCharacter(answer, count, integer1.charAt(j));
				}
				else
				{
				if (integer1.charAt(j) - '0' >= integer2.charAt(k) - '0')
				{
					answer = tangible.StringFunctions.changeCharacter(answer, count, (integer1.charAt(j) - '0' - (integer2.charAt(k) - '0')) + '0');
				}
				else
				{
					integer1 = tangible.StringFunctions.changeCharacter(integer1, j - 1, integer1.charAt(j - 1) - 1);
					answer = tangible.StringFunctions.changeCharacter(answer, count, integer1.charAt(j) - '0' + 10 - (integer2.charAt(k) - '0') + '0');
				}
				}
			}
			for (int j = 0;j < 100;j++)
			{
				if (answer.charAt(j) != '\0')
				{
					System.out.print(answer.charAt(j));
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

