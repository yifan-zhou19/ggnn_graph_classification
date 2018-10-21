package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		int check;
		int i;
		String name = new String(new char[81]);
		String num = new String(new char[10]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		while (n-- != 0)
		{
			check = 1;
			name = new Scanner(System.in).nextLine();
			len = name.length();
			for (i = 0;i < len;i++)
			{
				if (i == 0)
				{
					if ((name.charAt(i) == '_') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z'))
					{
						continue;
					}
					else
					{
						check = 0;
						break;
					}
				}
				else
				{
					if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= '0' && name.charAt(i) <= '9') || (name.charAt(i) == '_'))
					{
						continue;
					}
					else
					{
						check = 0;
						break;
					}
				}
			}
			System.out.printf("%d\n",check);
		}
	}

}
