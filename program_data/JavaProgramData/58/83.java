package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String s = new String(new char[81]);
		int i;
		int flag = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			flag = 0; //???????,da?
			s = new Scanner(System.in).nextLine();
			j = 0;
			if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z'))
			{ //????????
				j++;
								flag = 1;
				while (s.charAt(j) != '\0')
				{
					if ((s.charAt(j) == '_') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9'))
					{
						flag = 1;
						j++;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			else
			{
				flag = 0;
			}
			if (flag != 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}





}

