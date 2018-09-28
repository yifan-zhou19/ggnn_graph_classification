package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char[][] array = new char[100][100];
		int i;
		int j = 0;
		int k;
		str = new Scanner(System.in).nextLine();
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			for (k = 0;str.charAt(j) != ' ' && str.charAt(j) != '\0';j++)
			{
				array[i][k] = str.charAt(j);
				k++;
			}
			if (i == 0)
			{
				array[i][k] = '\0';
			}
			else
			{
				array[i][k] = ' ';
				array[i][k + 1] = '\0';
			}
			if (str.charAt(j) == '\0')
			{
				break;
			}
			j++;
		}
		for (;i >= 0;i--)
		{
			for (k = 0;;k++)
			{
				if (array[i][k] == '\0')
				{
					break;
				}
				else
				{
					System.out.print(array[i][k]);
				}
			}
		}
	}

}
