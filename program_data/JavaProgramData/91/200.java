package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String org;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		org = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		org = new Scanner(System.in).nextLine();
		int i;
		int n;
		int d;
		n = org.length();
		for (i = 0;i < n - 1;i++)
		{

			d = (org.Substring(i)) + *(org.Substring(i) + 1);
			System.out.printf("%c",d);
		}
		d = (org.Substring(i)) + org;
		System.out.printf("%c\n",d);
	}



}
