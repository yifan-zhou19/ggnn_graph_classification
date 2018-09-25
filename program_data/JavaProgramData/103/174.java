package <missing>;

public class GlobalMembers
{
	public static void strupr(String a)
	{
		int i;
		for (i = 0; !a[i].equals('\0');i++)
		{
			if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
			{
				a[i] = a[i] + 'A'-'a';
			}
		}
	}
	 public static int Main()
	 {
		int i;
		int m;
		int n = 1;
		String a = new String(new char[1001]);
		a = new Scanner(System.in).nextLine();
		a.toUpperCase();
		for (i = 1;a.charAt(i - 1) != '\0';i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				n++;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i - 1),n);
				n = 1;
			}

		}

		return (0);
	 }

}
