package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String[] ss = new String[100];
		int i;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		//convert
		ss[n++] = s;
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) == ' ')
			{
				s = s.substring(0, i);
				ss[n++] = s.Substring(i) + 1;
			}
		}
		//output
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			if (strcmp(ss[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.print(ss[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}
