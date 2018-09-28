package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int a;
		int b;
		int c;
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		for (i = 0;i < 50;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, tempVar);
			}
			if (str1.charAt(i) == ' ')
			{
				break;
			}
		}
		a = i;
		str2 = new Scanner(System.in).nextLine();
		b = str2.length();
		for (i = 0;i < b;i++)
		{
			if (str1.charAt(0) == str2.charAt(i))
			{
				for (j = 0;j < a;j++,i++)
				{
					if (str1.charAt(j) == str2.charAt(i))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				if (j == a)
				{
					c = i - a;
					System.out.printf("%d\n",c);
					break;
				}
				else
				{
				i = i - j;
				continue;
				}
			}
			else
			{
				continue;
			}
		}
	}

}

