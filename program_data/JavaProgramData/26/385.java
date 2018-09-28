package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int k = 0;
		int i;
		int l;
		l = a.length();
		for (i = 0;i < l;i++)
		{
						if (a.charAt(i) != ' ')
						{
							k = 0;
						System.out.printf("%c",a.charAt(i));
						}
						else
						{
							 k++;
							 if (k == 1)
							 {
							 System.out.printf("%c",a.charAt(i));
							 }
						}
		}
		System.in.read();
	}


}
