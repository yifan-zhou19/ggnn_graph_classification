package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100]);
		char[][] a = new char[100][100];
		int i;
		int j = 0;
		int k = 0;
		cin.get(sentence,100,'\n');
		for (i = 0;;i++)
		{
			if (sentence.charAt(i) == '\0')
			{

				a[k][j] = '\0';
				k++;
				break;
			}

			if (sentence.charAt(i) != ' ')
			{
				a[k][j++] = sentence.charAt(i);
			}
			else
			{
				a[k][j] = '\0';
				j = 0;
				k++;
			}
		}
		for (i = k - 1;i > 0;i--)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;a[0][j] != '\0';j++)
		{
			System.out.print(a[0][j]);
		}
		return 0;
	}
}
