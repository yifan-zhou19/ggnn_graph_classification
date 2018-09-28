package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String origin_string = new String(new char[81]);
		int n;
		int i;
		int j;
		int length;
		int check = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			origin_string = new Scanner(System.in).nextLine();
			length = origin_string.length();
			if (origin_string.charAt(0) == '_' || (origin_string.charAt(0) >= 'A' && origin_string.charAt(0) <= 'Z') || (origin_string.charAt(0) >= 'a' && origin_string.charAt(0) <= 'z'))
			{
				check = 1;
			}
			else
			{
				check = 0;
			}
			for (j = 1;j < length;j++)
			{
				if (check == 1)
				{
					if (origin_string.charAt(j) == ' ')
					{
						  check = 0;
						  break;
					}

					if (origin_string.charAt(j) == '_' || (origin_string.charAt(j) >= 'A' && origin_string.charAt(j) <= 'Z') || (origin_string.charAt(j) >= 'a' && origin_string.charAt(j) <= 'z') || (origin_string.charAt(j) >= '0' && origin_string.charAt(j) <= '9'))
					{
						check = 1;
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

