package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		int i;
		int L = p.length();
		for (i = 0;i < L - 1;i++)
		{
			System.out.printf("%c",*(p.Substring(i)) + *(p.Substring(i) + 1));
		}
		System.out.printf("%c\n",*(p.Substring(L) - 1) + p);
	}


}
