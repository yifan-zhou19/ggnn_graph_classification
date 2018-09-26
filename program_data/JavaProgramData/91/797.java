package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
								 if ((*(p.Substring(i) + 1)) == '\0')
								 {
													 j = (*(p.Substring(i))) + (*(p.Substring(0)));
													 System.out.printf("%c",j);
								 }
								 else
								 {
													 j = (*(p.Substring(i))) + (*(p.Substring(i) + 1));
													 System.out.printf("%c",j);
								 }
		}

		return 0;
	}
}
