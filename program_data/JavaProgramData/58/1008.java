package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] str = new String[100];
		String p = new String(new char[2]);
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			str[i] = (String)malloc(124 * (Character.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z' || str[i] == '_')
			{
				for (j = 0; * (str[i] + j) != '\0';j++)
				{
					if (!(*(str[i] + j) >= 'a' && *(str[i] + j) <= 'z' || *(str[i] + j) >= 'A' && *(str[i] + j) <= 'Z' || *(str[i] + j) == '_' || *(str[i] + j) >= '0' && *(str[i] + j) <= '9'))
					{
						break;
					}
				}
				if (*(str[i] + j) != '\0')
				{
					System.out.print("0\n");
				}
				else
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}

}

