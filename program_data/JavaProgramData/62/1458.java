package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
		String p;
		int n;
		int k;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		p = str;
		n = str.length();
		k = n;
		for (i = 0;i < n;i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				System.out.printf("%c",*(p.Substring(i)));
			}
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) != ' ')
			{
				System.out.print(" ");
			}
		}
		return 0;
	}


}
