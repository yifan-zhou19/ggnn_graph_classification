package <missing>;

public class GlobalMembers
{
	public static int check(char c)
	{
		if (c <= 'z' && c >= 'a')
		{
			return 0;
		}
		if (c <= 'Z' && c >= 'A')
		{
			return 0;
		}
		if (c == '\'')
		{
			return 0;
		}
		return 1;
	}
	public static void Main()
	{
		int check = char c;
		int i = 0;
		int j = 0;
		int l = 0;
		int max = 0;
		int min = 0;
		int jmax = 0;
		int jmin = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[100]);
		char[][] b = new char[100][30];
		a = new Scanner(System.in).nextLine();

		p = a;
		while (*p != null)
		{
			while (*p != '\0' && check(*p) != 0)
			{
				p++;
			}

			if (*p == '\0')
			{
				break;
			}
			sscanf(p,"%[A-Z'a-z]",b[i]);
			p += String.valueOf(b[i]).length();
			i++;
		}
		max = String.valueOf(b[0]).length();
		min = String.valueOf(b[0]).length();
		for (j = 0;j < i;j++)
		{
			l = String.valueOf(b[j]).length();
			if (l > max)
			{
				max = l;
				jmax = j;
			}
			else if (l < min)
			{
				min = l;
				jmin = j;
			}
		}

		System.out.printf("%s\n%s\n",b[jmax],b[jmin]);
	}

}
