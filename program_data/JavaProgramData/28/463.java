package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String sent = new String(new char[999]);
		int l;
		int i;
		int k = 0;
		sent = new Scanner(System.in).nextLine();
		l = sent.length();
		for (i = 0;i < l;i++)
		{
			if (sent.charAt(i) != ' ')
			{
				k++;
			}
			if (sent.charAt(i) == ' ' && i != 0 && k != 0)
			{
				System.out.printf("%d,",k);
				k = 0;
			}
		}
		System.out.printf("%d\n",k);
	}

}
