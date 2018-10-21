package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 1;
		int s;
		int n = 0;
		int m;
		int word = 1;
		int k = 0;
		int lenth;
		int x = 0;
		int t = 0;
		String string = new String(new char[100]);
		char[][] a = new char[100][100];
		String = new Scanner(System.in).nextLine();
		lenth = String.length();
		for (t = 0;t < lenth;t++)
		{
			if (String[t] == ' ')
			{
				x = 1;
				break;
			}

		}
		if (x == 0)
		{
			System.out.println(String);
		}
		else if (x == 1)
		{
		for (i = 0;i < 100;i++)
		{
			if (String[i] != ' ')
			{
				a[0][i] = string.charAt(i);
			}
			else
			{
				a[0][i] = '\0';
				break;
			}
		}

		for (s = i + 1;s < 100;s++)
		{
			if (String[s] == ' ' && word == 1)
			{
				a[j][k] = '\0';
				j++;
				word = 0;
				k = 0;
			}
			if (String[s] != ' ')
			{
				word = 1;
				a[j][k] = string.charAt(s);
				k++;
			}
		}

		for (m = j;m > 0;m--)
		{
			System.out.printf("%s ",a[m]);
		}
		System.out.printf("%s",a[0]);
		}
	}



}
