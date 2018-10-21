package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int maxi;
		char max;
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		while (scanf("%s ",a) != EOF)
		{
			max = a.charAt(0);
			b = new Scanner(System.in).nextLine();
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) > max)
				{
					maxi = i;
					max = a.charAt(i);
				}
			}
			for (i = 0;i <= maxi;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.printf("%s",b);
			for (i = maxi + 1;a.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");
		}
	}


}
