package <missing>;

public class GlobalMembers
{
	public static int hh(char stu1,char stu2)
	{
		int a1;
		int a2;
		int b;
		a1 = stu1;
		a2 = stu2;
		b = a1 + a2;
		return (b);
	}
	public static int Main()
	{
		final String s = "";
		int[] b = new int[1000];
		int i;
		s = new Scanner(System.in).nextLine();
		i = 0;
		while (s.charAt(i + 1) != '\0')
		{
			b[i] = hh(s.charAt(i), s.charAt(i + 1));
			i++;
		}
		b[i] = hh(s.charAt(0), s.charAt(i));
		for (i = 0;b[i] != 0;i++)
		{
			System.out.printf("%c",b[i]);
		}
		return 0;

	}
}
