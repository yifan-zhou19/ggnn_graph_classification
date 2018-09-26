package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		while (str1.charAt(i) != '\0')
		{
			if (str1.charAt(i) != str2.charAt(i) && str1.charAt(i) + 32 != str2.charAt(i) && str1.charAt(i) - 32 != str2.charAt(i))
			{
				if ((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') && (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'))
				{
					if (str1.charAt(i) > str2.charAt(i))
					{
					System.out.print(">");
					break;
					}
				   else
				   {
					System.out.print("<");
					break;
				   }
				}
				if ((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') && (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'))
				{
					if (str1.charAt(i) > str2.charAt(i))
					{
					System.out.print(">");
					break;
					}
				   else
				   {
					System.out.print("<");
					break;
				   }
				}
				if ((str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') && (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z'))
				{
					if (str1.charAt(i) > str2.charAt(i) - 32)
					{
					System.out.print(">");
					break;
					}
				   else if (str1.charAt(i) < str2.charAt(i) - 32)
				   {
					System.out.print("<");
					break;
				   }
				}
					if ((str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') && (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z'))
					{
					if (str1.charAt(i) - 32 > str2.charAt(i))
					{
					System.out.print(">");
					break;
					}
				   else if (str1.charAt(i) - 32 < str2.charAt(i))
				   {
					System.out.print("<");
					break;
				   }
					}
			}
			if (str1.charAt(i + 1) == '\0')
			{
				System.out.print("=");
			}
			i = i + 1;
		}
	}

}
