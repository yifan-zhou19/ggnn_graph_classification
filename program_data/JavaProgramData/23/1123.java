package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		char[][] b = new char[50][100];
		int i;
		int j = 0;
		int k = 0;
		int n;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 101 && a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				b[j][k] = '\0';
				j++;
				k = 0;
			}
		}
			b[j][k] = '\0';
		n = j;
		for (i = n;i > 0;i--)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s\n",b[0]);
	}
}
