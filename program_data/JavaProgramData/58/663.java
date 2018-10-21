package <missing>;

public class GlobalMembers
{
	public static int First(char i)
	{
		if ((i != '_') && ((i < 65) || ((i>90) && (i < 97)) || (i>122)))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Rest(char i)
	{
			if ((i != '_') && ((i < 48) || ((i>57) && (i < 65)) || ((i>90) && (i < 97)) || (i>122)))
			{
			return 0;
			}
		else
		{
			return 1;
		}
	}



	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag;
		String str = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			flag = 1;
			if ((First(str.charAt(0))) != 0)
			{

				for (j = 1;str.charAt(j) != '\0';j++)
				{

					if ((Rest(str.charAt(j))) != 0)
					{
						flag = 1;
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
		if (flag == 1)
		{
			System.out.print("1\n");
		}
		else
		{
			System.out.print("0\n");
		}
		}

		return 0;
	}
}

