package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j = 0;
	int k = 0;
	String s = new String(new char[1000]);
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	char[][] p = new char[100][100];
	s = new Scanner(System.in).nextLine();
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	for (i = 0;i < s.length();i++)
	{
		if (s.charAt(i) == ' ')
		{
			j++;
			k = 0;
		}
		else
		{
			  p[j][k] = s.charAt(i);
			  k++;
		}
	}
	for (i = 0;i <= j;i++)
	{
		if (strcmp(p[i],a) == 0)
		{
		   p[i] = b;
		}
	}
	System.out.print(p[0]);
	for (i = 1;i <= j;i++)
	{
		System.out.print(' ');
		System.out.print(p[i]);
	}

	return 0;
	}
}

