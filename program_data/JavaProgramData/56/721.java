package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		String n = new String(new char[5]);
		while ((n[i] = System.in.read()) != '\n')
		{
			i = i + 1;
		}
		i = i - 1;
		while (i >= 0)
		{
			System.out.printf("%c",n.charAt(i));
			i = i - 1;
		}
	System.out.print("\n");
	}
}
