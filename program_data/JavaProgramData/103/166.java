package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int temp = 1;
		int i;
		for (i = 0;i <= a.length() - 1;i++)
		{
			if (((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z')))
			{
				a.charAt(i) += 'A'-'a';
			}
		}
		if (a.length() == 1)
		{
		System.out.printf("(%c,%d)",a.charAt(0),1);
		}
		else
		{
		for (i = 1;i <= a.length() - 1;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
			temp++;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i - 1),temp);
				temp = 1;
			}
			if (a.charAt(i + 1) == 0)
			{
				System.out.printf("(%c,%d)",a.charAt(i),temp);
			}
		}
		}
		return 0;
	}

}
