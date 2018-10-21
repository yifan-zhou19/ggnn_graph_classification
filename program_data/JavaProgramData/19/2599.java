package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		char[][] a = new char[50][20];
		String t = new String(new char[20]);
		String word1 = new String(new char[20]);
		String word2 = new String(new char[20]);
		int i;
		int j = 0;
		int k = 0;
		int num;
		int p1;
		int p2;
		int q1;
		int q2;
		str = new Scanner(System.in).nextLine();

		for (i = 0;str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == ',')
			{
				a[j][k] = 0;
				j++;
				k = 0;
			}
			else
			{
				a[j][k] = str.charAt(i);
				k++;
			}
		}

		a[j][k] = 0;

		word1 = new Scanner(System.in).nextLine();
		word2 = new Scanner(System.in).nextLine();


		for (k = 0;k < j + 1;k++)
		{
			if (strcmp(word1,a[k]) == 0)
			{

				a[k] = word2;
			}
		}


		for (k = 0;k < j + 1;k++)
		{
			if (String.valueOf(a[k]).length() != 0)
			{
				if (k == 0)
				{

				System.out.printf("%s",a[k]);
				}
				else
				{
				System.out.printf(" %s",a[k]);
				}
			}
		}


		return 0;
	}
}
