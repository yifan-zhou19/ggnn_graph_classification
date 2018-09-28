package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void anaylse(char c[]);
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		anaylse(c);
	}
	public static void anaylse(String c)
	{
		int i;
		for (i = 0;i < 31;i++)
		{
			if (c[i].compareTo(47) > 0 && c[i].compareTo(58) < 0 && c[i + 1].compareTo(47) > 0 && c[i + 1].compareTo(58) < 0)
			{
				System.out.printf("%c",c[i]);
			}
			if (c[i].compareTo(47) > 0 && c[i].compareTo(58) < 0 && (c[i + 1].compareTo(47) <= 0 || c[i + 1].compareTo(58) >= 0))
			{
				System.out.printf("%c\n",c[i]);
			}
		}
	}



}
