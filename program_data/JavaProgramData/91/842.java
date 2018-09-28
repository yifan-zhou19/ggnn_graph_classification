package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String pi;
	int i;
	int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	pi = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
	pi = new Scanner(System.in).nextLine();
	m = pi.length();
	for (i = 0;i < m - 1;i++)
	{
		System.out.printf("%c",*(pi.Substring(i)) + *(pi.Substring(i) + 1));
	}
	System.out.printf("%c",*(pi.Substring(m) - 1) + (pi));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(pi);

	return 0;
	}
}
