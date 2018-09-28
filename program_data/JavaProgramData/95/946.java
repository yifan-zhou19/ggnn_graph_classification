package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1;
		String str2;
		String p;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str1 = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str2 = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		p = str1;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z')
			{
				*(p.Substring(i)) += 32;
			}
		}
		p = str2;
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z')
			{
				*(p.Substring(i)) += 32;
			}
		}
		if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}
