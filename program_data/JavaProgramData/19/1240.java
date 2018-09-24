package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * str;
		String s1;
		String s2;
		String t;
		String str2;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str = (String)calloc(102,LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		s1 = (String)calloc(102,LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		s2 = (String)calloc(102,LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		t = (String)calloc(102,LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str2 = (String)calloc(240,LEN);
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
		do
		{
			sscanf(str,"%s",t);
			n = t.length();
			str = str + n + 1;
			if (strcmp(t,s1) == 0)
			{
				str2 += s2;
			}
			else
			{
				str2 += t;
			}
			if (*str != '\0')
			{
			str2 += " ";
			}
		} while (*str != '\0');
		System.out.printf("%s",str2);
	}
}

