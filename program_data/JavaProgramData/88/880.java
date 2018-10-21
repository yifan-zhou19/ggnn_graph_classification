package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
		if (p > 47 && p < 58)
		{
			System.out.printf("%c", p);
		}
		for (i = 1;i < n;i++)
		{
			if ((*(p.Substring(i)) > 47 && *(p.Substring(i)) < 58) && (*(p.Substring(i) - 1) < 48 || *(p.Substring(i) - 1)>57))
			{
				System.out.print("\n");
			}
			if (*(p.Substring(i)) > 47 && *(p.Substring(i)) < 58)
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
		}


	}
}
