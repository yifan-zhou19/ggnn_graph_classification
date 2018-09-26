package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
		for (i = 0;i <= n - 2;i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(q.Substring(n) - 1) = *(p.Substring(n) - 1) + *(p.Substring(0));
		*(q.Substring(n)) = '\0';
		System.out.println(q);
	}
}
