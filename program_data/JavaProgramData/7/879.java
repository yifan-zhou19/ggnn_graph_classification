package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String org;
		String sub;
		String re;
		int i;
		int j;
		int flag;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		org = (String)malloc(1024 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sub = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		re = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		org = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		for (i = 0; * (org.Substring(i)) != '\0';i++)
		{
			if (*(org.Substring(i)) == sub)
			{
				for (j = 0; * (sub.Substring(j)) != '\0';j++)
				{
					flag = 0;
					if (*(org.Substring(i) + j) != *(sub.Substring(j)))
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (j = 0; * (re.Substring(j)) != '\0';j++)
					{
						*(org.Substring(i) + j) = *(re.Substring(j));
					}
					break;
				}

			}
		}
		System.out.printf("%s",org);
	}

}
