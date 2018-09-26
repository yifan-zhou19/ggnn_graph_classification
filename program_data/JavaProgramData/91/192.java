package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(100 * sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		q = (String)malloc(100 * sizeof(String));
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (i = 0;i < l - 1;i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(q.Substring(l) - 1) = *(p.Substring(l) - 1) + p;
		*(q.Substring(l)) = '\0';
		System.out.println(q);
	}
}
