package <missing>;

public class GlobalMembers
{
	public static int find(tangible.RefObject<String> s)
	{
		int i;
		int j;
		int k;
		for (i = 1;i <= 40;i++)
		{
			if (*(s.argValue.Substring(i)) == ' ')
			{
				return i;
			}
		}
	}
	public static String s = new String(new char[1000]);
	public static int Main()
	{
		int i;
		int j;
		int n;
		int d = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0; * (s.Substring(i)) != '\0';i++)
		{
			d += 1;
			if (*(s.Substring(i)) == ' ' && d <= 81 && d + find(s.Substring(i))>81)
			{
				System.out.print("\n");
				d = 0;
			}
			else
			{
				System.out.printf("%c",*(s.Substring(i)));
			}
		}
		s = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		return 0;
	}
}

