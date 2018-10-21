package <missing>;

public class GlobalMembers
{
	public static int f1(int k)
	{
		int i;
		int a = 1;
		for (i = 1;i <= k;i++)
		{
			a = a * 10;
		}
		return (a);
	}

	public static void Main()
	{
		int i;
		int j;
		int k = 1;
		int p = 0;
		int sign = 2;
		String s = new String(new char[1500]);
		char[][] a = new char[301][5];
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				a[k][p] = s.charAt(i);
				p++;
			}
			else if (s.charAt(i) == 44)
			{
				a[k][p] = '\0';
				k++;
				p = 0;
			}
		}
		a[k][p] = '\0';
		for (i = 2;i <= k;i++)
		{
			if (strcmp(a[1],a[i]) != 0)
			{
				p = -1;
				break;
			}
		}
		if (k == 1 || p != -1)
		{
			System.out.print("No");
		}
	else
	{

		for (i = 1;i <= sign;i++)
		{
			for (j = 1;j <= k - i;j++)
			{
				if (String.valueOf(a[j]).length() > String.valueOf(a[j + 1]).length())
				{
					a[0] = a[j];
					a[j] = a[j + 1];
					a[j + 1] = a[0];
				}
				else if (String.valueOf(a[j]).length() == String.valueOf(a[j + 1]).length())
				{
					if (strcmp(a[j],a[j + 1]) > 0)
					{
						a[0] = a[j];
						a[j] = a[j + 1];
						a[j + 1] = a[0];
					}
				}
			}
		}
		for (i = 1;;i++)
		{
			if (strcmp(a[k],a[k - sign + 1]) == 0)
			{
				sign++;
				for (j = 1;j <= k - sign;j++)
				{
					if (String.valueOf(a[j]).length() > String.valueOf(a[j + 1]).length())
					{
						a[0] = a[j];
						a[j] = a[j + 1];
						a[j + 1] = a[0];
					}
					else if (String.valueOf(a[j]).length() == String.valueOf(a[j + 1]).length())
					{
						 if (strcmp(a[j],a[j + 1]) > 0)
						 {
							a[0] = a[j];
							a[j] = a[j + 1];
							a[j + 1] = a[0];
						 }
					}
				}
			}
			else
			{
				break;
			}
		}
		for (i = 0;a[k - sign + 1][i] != '\0';i++)
		{
			System.out.printf("%c",a[k - sign + 1][i]);
		}
	}
	}









}
