import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		final String house = "";
		int day;
		int i; //????
		int j;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			house = tangible.StringFunctions.changeCharacter(house, i, new Scanner(System.in).nextLine());
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = n;i > 0;i--)
		{
			for (j = n;j > 0;j--)
			{
				house.charAt(i)[j] = house.charAt(i)[j - 1];
			}
			house.charAt(i)[0] = '\0';
		}

		for (day = 2;day <= m;day++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (house.charAt(i)[j] == '@')
					{
						if (house.charAt(i - 1)[j] == '.')
						{
							house.charAt(i - 1)[j] = ',';
						}
						if (house.charAt(i + 1)[j] == '.')
						{
							house.charAt(i + 1)[j] = ',';
						}
						if (house.charAt(i)[j - 1] == '.')
						{
							house.charAt(i)[j - 1] = ',';
						}
						if (house.charAt(i)[j + 1] == '.')
						{
							house.charAt(i)[j + 1] = ',';
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (house.charAt(i)[j] == ',')
					{
						house.charAt(i)[j] = '@';
					}
				}
			}
		}

		int count = 0;

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (house.charAt(i)[j] == '@')
				{
					count++;
				}
			}
		}

		System.out.print(count);

		return 0;
	}
}

