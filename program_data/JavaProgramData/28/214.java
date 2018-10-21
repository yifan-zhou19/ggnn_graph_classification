package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int n = 0;
		int t;
		int i = 0;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			t = 0;
			while ((a.charAt(i) == ' ') && (a.charAt(i) != '\0'))
			{
				i += 1;
			}
			while ((a.charAt(i) != ' ') && (a.charAt(i) != '\0'))
			{
				t += 1;
				i += 1;
			}
			if (n > 0)
			{
				System.out.print(",");
			}
			if (t > 0)
			{
				System.out.printf("%d",t);
				n += 1;
			}
			if (a == '\0')
			{
				break;
			}
		}
	}
}
