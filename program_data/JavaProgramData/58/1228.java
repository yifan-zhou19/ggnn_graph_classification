package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag = 1;
		int len;
		String name = new String(new char[124]);
		String p = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		name = (char[124])malloc(124 * (Character.SIZE / Byte.SIZE) * 20);
			*name = new Scanner(System.in).nextLine();
		for (i = 1;i < n;i++)
		{
			  *(name.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			len = String.valueOf(*(name.Substring(i))).length();
			if (**(name.Substring(i)) == '_' || (**(name.Substring(i)) <= 'Z' && **(name.Substring(i)) >= 'A') || ('a' <= **(name.Substring(i)) && **(name.Substring(i)) <= 'z'))
			{
				for (j = 1;j < len;j++)
				{
					if (!(('0' <= *(*(name.Substring(i)) + j) && *(*(name.Substring(i)) + j) <= '9') || ('A' <= *(*(name.Substring(i)) + j) && *(*(name.Substring(i)) + j) <= 'Z') || ('a' <= *(*(name.Substring(i)) + j) && *(*(name.Substring(i)) + j) <= 'z') || *(*(name.Substring(i)) + j) == '_'))
					{
					flag = 0;
					}

				}
				{
					if (flag == 0)
					{
						System.out.print("0\n");
					}
				else
				{
					System.out.print("1\n");
				}
			}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

