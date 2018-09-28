package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(char * p,int x);
		String s = new String(new char[10000]);
		int i;
		int j = 0;
		int temp;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			j++;
		}
		System.out.printf("%d",j);
		for (i = j;s.charAt(i) != '\0';i++)
		{
		if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
		{
			temp = f(s, i + 1);
			System.out.printf(",%d",temp);
		}
		}
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int f(char * p, int x)
	{
		int n;
		n = 0;
		p = p.Substring(x);
		while (*p != ' ' && *p != '\0')
		{
			n++;
			p = p.Substring(1);
		}
		return n;
	}
}
