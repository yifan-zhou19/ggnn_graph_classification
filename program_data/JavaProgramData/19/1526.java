package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s0 = new String(new char[101]);
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		char[][] a = new char[100][21];
		int i = 0;
		int j = 0;
		int k = 0;
		s0 = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();

		for (i = 0,j = 0;i < s0.length();i++)
		{
			if (s0.charAt(i) != ' ')
			{
			a[j][k] = s0.charAt(i),k++;
			}
			else
			{
			a[j][k] = '\0',j++,k = 0;
			}
		}

		a[j][k] = '\0';
		for (i = 0;i <= j;i++)
		{
			if (strcmp(a[i],s1) == 0)
			{
				if (k != 0)
				{
				System.out.printf("%s",s2);
				k = 0;
				}
				else
				{
				System.out.printf(" %s",s2);
				}
			}
			else
			{
				if (k != 0)
				{
				System.out.printf("%s",a[i]);
				k = 0;
				}
				else
				{
				System.out.printf(" %s",a[i]);
				}
			}
		}




	}
}
