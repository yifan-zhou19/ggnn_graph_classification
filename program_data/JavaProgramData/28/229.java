package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[30000]);
		char[][] word = new char[300][100];
		int i = 0;
		int j = 0;
		int k;
		int t;
		int[] l = new int[300];
		String = new Scanner(System.in).nextLine();
		for (k = 0;string.charAt(k) != '\0';k++)
		{
			if (String[k] != 32)
			{
				word[i][j] = string.charAt(k);
				if (String[k + 1] != 32 && string.charAt(k + 1) != '\0')
				{
					j++;
				}
				else
				{

					 l[i] = j;
					word[i][j + 1] = '\0';
					j = 0;
					i++;
				}
			}
		}
		for (k = 0;k < i - 1;k++)
		{

			System.out.printf("%d,",l[k] + 1);

		}
		System.out.printf("%d\n",l[i - 1] + 1);

	}




}
