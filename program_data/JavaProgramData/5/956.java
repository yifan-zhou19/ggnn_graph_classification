package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float n;
		final String a = "";
		final String b = "";
		int i;
		int sum = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() != b.length())
		{
		System.out.print("error\n");
		}
		else
		{
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
				{
					if (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')
					{
						if (a.charAt(i) == b.charAt(i))
						{
						sum++;
						}
					}
				}
				else
				{
					System.out.print("error\n");
					m = 1;
					break;
				}
			}
			if (m == 0)
			{
				if (((float)sum / a.length()) > n)
				{
				System.out.print("yes\n");
				}
				else
				{
				System.out.print("no\n");
				}
			}
		}

		return 0;
	}

}

