package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String s;
		String c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc((Character.SIZE / Byte.SIZE) * 105);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc((Character.SIZE / Byte.SIZE) * 105);
		s = new Scanner(System.in).nextLine();
		for (i = 0; * (s.Substring(i) + 1) != '\0';i++)
		{
			*(c.Substring(i)) = *(s.Substring(i)) + *(s.Substring(i) + 1);
		}
		*(c.Substring(i)) = *(s.Substring(i)) + s;
		*(c.Substring(i) + 1) = '\0';
		System.out.println(c);
	}

}
