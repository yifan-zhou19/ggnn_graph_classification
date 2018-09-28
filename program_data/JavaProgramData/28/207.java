package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[20000]);
		int i;
		int count = 0;
		int flag = 0;
		for (i = 0;i < 20000;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		}
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 20000;i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				count++;
			}
			else
			{
				if (count != 0)
				{
					flag++;
					if (flag == 1)
					{
						System.out.printf("%d",count);
					}
					else
					{
						System.out.printf(",%d",count);
					}
				}
			   count = 0;
			}
		}
	}

}

