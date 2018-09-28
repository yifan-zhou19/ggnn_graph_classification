package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		int n;
		int i;
		int p = 0;
		str = new Scanner(System.in).nextLine();
		i = 0;
		while (str.charAt(i) != '\0')
		{
			for (;str.charAt(i) == ' ';i++)
			{
				;
			}
			n = 0;
			for (;str.charAt(i) != ' ' && str.charAt(i) != '\0';i++)
			{
				n++;
			}
			p++;
			if (p != 1)
			{
				System.out.print(",");
			}
			System.out.printf("%d",n);

		}
		System.out.print("\n");
	}


}
