package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[50]);
		cin.get(ch, 50, '\n');
		int i = 0;
		int n = ch.length();
		for (i = 0 ; i <= n - 1 ; i++)
		{
			 if ((int)ch.charAt(i) >= 48 && (int)ch.charAt(i) <= 57)
			 {
			 System.out.print(ch.charAt(i));
			 }
			 else
			 {
			 if (i > 0)
			 {
			 if ((int)ch.charAt(i - 1) >= 48 && (int)ch.charAt(i - 1) <= 57)
			 {
			 System.out.print("\n");
			 }
			 }
			 }
		}
	return 0;
	}
}
