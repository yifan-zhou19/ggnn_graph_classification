package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[81]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (char[81])malloc(n * sizeof(char[81]));
		String head = new String(new char[81]);
		head = p;
		int i;
		for (i = 0;i < n;i++)
		{
			*p = new Scanner(System.in).nextLine();
			p = p.Substring(1);
		}
		p = head;
		for (i = 0;i < n;i++)
		{
			if (**p == '_' || (**p >= 'a' && **p <= 'z') || (**p >= 'A' && **p <= 'Z'))
			{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * al = p;
				while (*al != '\0')
				{
				   if (!((*al >= '0' && *al <= '9') || (*al >= 'a' && *al <= 'z') || (*al >= 'A' && *al <= 'Z') || (*al == '_')))
				   {
					   System.out.print("0\n");
					   break;
				   }
				   al++;
				}
				if (*al == '\0')
				{
					System.out.print("1\n");
				}
			}
			else
			{
				System.out.print("0\n");
			}
			p = p.Substring(1);
		}
		return 0;
	}
}

