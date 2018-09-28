package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[5000]);
		final String temp = "";
		String min = new String(new char[20]);
		String max = new String(new char[20]);
		int i;
		int j;
		int flag = 0;
		c = new Scanner(System.in).nextLine();
		for (i = 0;i <= 20;i++)
		{
			if (c.charAt(i) == ' ' || c.charAt(i) == ',' || c.charAt(i) == '\0')
			{
				min = tangible.StringFunctions.changeCharacter(min, i, '\0');
				max = tangible.StringFunctions.changeCharacter(max, i, '\0');
				break;
			}
			min = tangible.StringFunctions.changeCharacter(min, i, c.charAt(i));
			max = tangible.StringFunctions.changeCharacter(max, i, c.charAt(i));
		}
		i++;
		if (c.charAt(i - 1) != '\0')
		{
			for (;i <= 5000;i++)
			{
			for (j = 0;j <= 500;j++)
			{
			if (j == 0 && (c.charAt(i + j) == ' ' || c.charAt(i + j) == ',' || c.charAt(i + j) == '\0'))
			{
			continue;
			}
			if (c.charAt(i + j) == ' ' || c.charAt(i + j) == ',' || c.charAt(i + j) == '\0')
			{
			temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
			if (temp.length() > max.length())
			{
				max = temp;
			}
			else if (temp.length() < min.length())
			{
				min = temp;
			}
			if (c.charAt(i + j) == '\0')
			{
			flag = 1;
			}
			i = i + j;
			break;
			}
			else
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, c.charAt(i + j));
			}
			}
			if (flag == 1)
			{
			break;
			}
			}
		}

			System.out.printf("%s\n",max);
			System.out.printf("%s",min);
		return 0;
	}

}

