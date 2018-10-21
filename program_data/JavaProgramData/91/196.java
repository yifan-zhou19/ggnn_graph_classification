package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		l = p.length();
		*(p.Substring(l)) = (p);
		for (i = 0;i < l;i++)
		{
			*(p.Substring(i)) += *(p.Substring(i) + 1);
		}
		*(p.Substring(l)) = '\0';
		System.out.println(p);
	}
}
