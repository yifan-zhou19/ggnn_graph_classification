package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch = new String(new char[100]);
		char male;
		int i;
		int len;

		ch = new Scanner(System.in).nextLine();
		len = ch.length();
		male = ch.charAt(0);
		for (i = 1;i < len;i++)
		{
			if (ch.charAt(i) != male)
			{
				int j = i;
				int n1 = 0;
				int n2 = 0;

				for (;j > -1;j = j - 1)
				{
					if (n1 == n2 && ch.charAt(j - 1) == male)
					{
						System.out.printf("%d %d\n",(j - 1),i);
						break;
					}
					if (ch.charAt(j - 1) == male)
					{
						n1++;
					}
					else
					{
						n2++;
					}
				}
			}
		}
	}
}
