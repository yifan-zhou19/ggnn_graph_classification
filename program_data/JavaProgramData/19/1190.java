package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
		String s1;
		String s2;
		(char)(*s)[101];
		int i;
		int j = 0;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String) malloc(101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s1 = (String) malloc(101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s2 = (String) malloc(101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		s = (char [101])calloc(101,101);
		str = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0; * (str.Substring(i)) != '\0';i++)
		{
			if (*(str.Substring(i)) == ' ')
			{
				k++;
				j = 0;
			}
			else if (*(str.Substring(i)) != ' ')
			{
				*(*(s + k) + j) = *(str.Substring(i));
				j++;
			}
		}
			for (i = 0;i <= k;i++)
			{
				if (strcmp(*(s + i),s1) == 0)
				{
					*(s + i) = s2;
				}
			}
			System.out.printf("%s",*s);
			for (i = 1;i <= k;i++)
			{
				System.out.printf(" %s",*(s + i));
			}
	}
}

