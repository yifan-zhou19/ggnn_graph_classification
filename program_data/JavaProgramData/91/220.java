package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1;
		String s2;
		int i;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s1 = new Scanner(System.in).nextLine();
		len = s1.length();
		for (i = 0;i < len - 1;i++)
		{
			*(s2.Substring(i)) = *(s1.Substring(i)) + *(s1.Substring(i) + 1);
		}
			*(s2.Substring(len) - 1) = (s1) + *(s1.Substring(len) - 1);
			for (i = 0;i < len;i++)
			{
				System.out.printf("%c",*(s2.Substring(i)));
			}
	}
}
