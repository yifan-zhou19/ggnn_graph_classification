package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[5000]);
		char[][] m = new char[100][20];
		String s1 = new String(new char[20]);
		String s2 = new String(new char[20]);
		n = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k = 0;
		int e;
		e = n.length();
			for (i = 0;i < e;i++)
			{
			if (n.charAt(i) != ' ')
			{
				m[j][k] = n.charAt(i);
				k++;
			}
			 if (n.charAt(i) == ' ')
			 {
				m[j][k] = '\0';
				j++;
				k = 0;
			 }
			}
					   m[j][k] = '\0';
					for (i = 0;i <= j;i++)
					{
			if (strcmp(m[i],s1) == 0)
			{
					  m[i] = s2;
			}

					}

		System.out.printf("%s",m[0]);
		for (i = 1;i <= j;i++)
		{

		System.out.printf(" %s",m[i]);
		}
		return 0;
	}



}
