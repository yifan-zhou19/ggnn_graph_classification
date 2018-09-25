package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String p;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		c = p;
		for (i = 0; * (p.Substring(i) + 1) != '\0';i++)
		{
			*(p.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(p.Substring(i)) = c + *(p.Substring(i));
		*(p.Substring(i) + 1) = '\0';
		System.out.println(p);
	}


}
