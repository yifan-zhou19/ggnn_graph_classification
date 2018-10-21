package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();
		int n;
		n = str.length();
		for (int i = 0;i < n;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				System.out.printf("%c",str.charAt(i));
			}
			else
			{
				System.out.print("\n");
				for (;str.charAt(i) < '0' || str.charAt(i)>'9';i++)
				{
				}
				i--;
			}
		}
		System.in.read();
	}

}
