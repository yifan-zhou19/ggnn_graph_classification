package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int panduan;
		int k;
		k = 0;
		panduan = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			panduan = 0;

				for (j = 0;b.charAt(j) != 0;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						panduan = 1;
						break;
					}
				}
			if (panduan == 0 && k == 0)
			{
				System.out.printf("%s",c);
				i += j - 1;
				k = 1;
			}
			else
			{
				System.out.printf("%c",a.charAt(i));
			}


		}
		return 0;



	}
}
