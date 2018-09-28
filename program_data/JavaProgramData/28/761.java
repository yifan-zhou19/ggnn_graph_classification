package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(301 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		p = q = str;
		while (true)
		{
			if (*p != ' ' && *p != '\0')
			{
				p++;
				continue;
			}
			if (*p == ' ' || *p == '\0')
			{
				n = p - q;
				if (n == 0)
				{
					p++;
					q = p;
					continue;
				}
				if (*p == '\0')
				{
					System.out.printf("%d",n);
					break;
				}
				if (*p == ' ')
				{
					System.out.printf("%d,",n);
					p++;
					q = p;
					continue;
				}
			}
		}
	}

}
