package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		int s;
		int t = 0;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		s = a.charAt(0);
		for (i = 0;i < len;i++)
		{



			if (s == a.charAt(i) || s == a.charAt(i) + 32 || s == a.charAt(i) - 32)
			{
				t++;
			}
			else
			{
				if (s > 'Z')
				{
					System.out.printf("(%c,%d)",s - 32,t);
				}
				else
				{
						System.out.printf("(%c,%d)",s,t);
				}
				s = a.charAt(i);
				t = 1;
			}

		}
		if (s > 'Z')
		{
					System.out.printf("(%c,%d)",s - 32,t);
		}
				else
				{
						System.out.printf("(%c,%d)",s,t);
				}

	return 0;

	}
}
