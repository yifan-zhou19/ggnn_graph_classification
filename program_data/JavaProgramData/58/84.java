package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int len;
		int count = 0;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		while (n-- != 0)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || s.charAt(0) == '_')
			{
				if (len == 1)
				{
					System.out.print("1\n");
				}
				else if (len > 1)
				{
					for (i = 1;i < len;i++)
					{
						if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) == '_') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
						{
							count++;
						}
					}
					if (count == len - 1)
					{
						System.out.print("1\n");
					}
					else
					{
						System.out.print("0\n");
					}
				}
			}
			else
			{
				System.out.print("0\n");
			}
			count = 0;
		}
	}

}

