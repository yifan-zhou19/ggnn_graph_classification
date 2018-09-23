package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String temp;
		String a;
		String b;
		int i;
		int j;
		int t;
		int n;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc((Character.SIZE / Byte.SIZE) * 1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		p1 = p2 = s;
		*(s.Substring(len)) = ' ';
		*(s.Substring(len) + 1) = '\0';
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (; * p1;p1++)
		{
			if (*p1 == ' ' || *p1 == '\0')
			{
				len = p1 - p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				temp = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
				for (i = 0;i < len;i++)
				{
					*(temp.Substring(i)) = *(p2.Substring(i));
				}
				*(temp.Substring(len)) = '\0';
				p2 = p1 + 1;
				if (strcmp(temp,a) == 0)
				{
					p2 == '\0'?System.out.printf("%s",b):printf("%s ",b);
				}
				else
				{
					p2 == '\0'?System.out.printf("%s",temp):printf("%s ",temp);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(temp);
			}
		}
	}
}
