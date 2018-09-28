package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i = 0;
		String p;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		for (;(c = System.in.read()) != '\n';)
		{
			if (c != ' ')
			{
				*(p.Substring(i)) = c;
				i++;
				t = 0;
			}
			if (c == ' ' && t == 0)
			{
				*(p.Substring(i)) = c;
				i++;
				t++;
			}
		}
		*(p.Substring(i)) = '\0';
		System.out.printf("%s",p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}
}
