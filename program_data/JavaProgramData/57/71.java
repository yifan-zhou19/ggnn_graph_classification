package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
	String s = new String(new char[10000]);
	s = new Scanner(System.in).nextLine();
	int i;
	int len;
	len = s.length();
	if (s.charAt(len - 2) == 'l' && s.charAt(len - 1) == 'y')
	{
		for (i = 0;i < len - 2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
	}
	else if (s.charAt(len - 2) == 'e' && s.charAt(len - 1) == 'r')
	{
		for (i = 0;i < len - 2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
	}
	else if (s.charAt(len - 3) == 'i' && s.charAt(len - 2) == 'n' && s.charAt(len - 1) == 'g')
	{
		for (i = 0;i < len - 3;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
	}
	}
	}

}

