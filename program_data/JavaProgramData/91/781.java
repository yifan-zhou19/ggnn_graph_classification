package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		int i;
		int n;
		int m;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
			m = (int)(*(s.Substring(i))) + (int)(*(s.Substring(i) + 1));
			System.out.printf("%c",m);
		}
		m = (int)(*(s.Substring(n) - 1)) + (int)(*(s.Substring(0)));
		System.out.printf("%c",m);
	}


}
