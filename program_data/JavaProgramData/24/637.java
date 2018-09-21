package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int m = 0;
		int n = 30;
		int m1;
		int n1;
		String s = new String(new char[1000]);
		char[][] w = new char[50][20];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		s = new Scanner(System.in).nextLine();
		for (a = s; * a != '\0';a++)
		{
			if (*a != ' ')
			{
				w[j][i] = a;
				i++;
			}
			if (*a == ' ')
			{
				w[j][i] = '\0';
				if (i > m)
				{
					m1 = j;
					m = i;
				}
				if (i < n)
				{
					n = i;
					n1 = j;
				}
				j++;
				i = 0;
			}
		}
		w[j][i] = '\0';
		if (i > m)
		{
			m1 = j;
			m = i;
		}
		if (i < n)
		{
			n = i;
			n1 = j;
		}
		System.out.printf("%s\n%s",w[m1],w[n1]);
	}



}
