package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10001]);
		int i;
		int j;
		int k;
		int flag;
		char c;
		i = 0;
		while ((c = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i++;
		}
		a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		flag = 1;
		for (j = 0;j < i;j++)
		{
			if (flag == 1)
			{
			if (a.charAt(j) != ' ')
			{
				k = 0;
				while (a.charAt(j + k) != ' ')
				{
					k++;
				}
				System.out.printf("%d",k);
				j = j + k;
				flag = 0;
			}
			}
			else
			{
				if (a.charAt(j) != ' ')
				{
				k = 0;
				while (a.charAt(j + k) != ' ')
				{
					k++;
				}
				System.out.printf(",%d",k);
				j = j + k;
				}
			}
		}
	}
}

