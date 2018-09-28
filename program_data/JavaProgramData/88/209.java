package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc((Character.SIZE / Byte.SIZE) * 30);
		s = new Scanner(System.in).nextLine();
		for (i = 0; * (s.Substring(i)) != '\0';i++)
		{
			if (*(s.Substring(i)) > '0' - 1 && *(s.Substring(i)) < '9' + 1)
			{
				if (*(s.Substring(i) + 1) > '0' - 1 && *(s.Substring(i) + 1) < '9' + 1)
				{
				System.out.printf("%c",*(s.Substring(i)));
				}
				else
				{
					System.out.printf("%c\n",*(s.Substring(i)));
				}
			}
		}
		return 0;
	}

}
