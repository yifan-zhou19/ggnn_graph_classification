package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
		String s1;
		int i;
		int n;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n - 1;i++)
		{
			*(s1.Substring(m)) = (char)(*(s.Substring(i)) + *(s.Substring(i) + 1));
			m++;
		}
		*(s1.Substring(n) - 1) = (char)(s + *(s.Substring(n) - 1));
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(s1.Substring(i)));
		}
		return 0;
	}
}
