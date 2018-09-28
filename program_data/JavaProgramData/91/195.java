package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		int i;
		int m;
		m = a.length();
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%c",*(a.Substring(i)) + *(a.Substring(i) + 1));
		}
		System.out.printf("%c", a + *(a.Substring(m) - 1));
	}
}
