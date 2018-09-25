package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int k = 0;
		int j;
		String p;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = calloc(30,(Character.SIZE / Byte.SIZE));
		p = a;
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (i = 0;i < l;i++)
		{
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57 && k == 2)
			{
				System.out.print("\n");
			}
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)
			{
				System.out.printf("%c",*(p.Substring(i)));
				k = 1;
			}
			else
			{
				k = 2;
			}
		}
	}
}
