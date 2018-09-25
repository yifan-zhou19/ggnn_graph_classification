package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 1;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
		for (i = 0;i < n;i++)
		{
			if ((*(p.Substring(i)) >= '0') && (*(p.Substring(i)) <= '9'))
			{
				System.out.printf("%c",*(p.Substring(i)));
				t = 0;
			}
			else if (t == 0)
			{
				System.out.print("\n");
				t++;
			}
		}
	}

}
