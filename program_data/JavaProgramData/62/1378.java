package <missing>;

public class GlobalMembers
{
	public static String getmemory(int num)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *p=(char*)malloc(num *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char p = (String)malloc(num * (Character.SIZE / Byte.SIZE)); //????????
		return p;
	}

	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * str; //str???????,p1?????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String a;
		String b;
		int n; //a,b???????????.
		str = getmemory(100); // ?????
		p1 = a = str;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		b = a.Substring(n);
		for (str = a;str < b;)
		{
			if (*str == ' ')
			{
				p1 = str;
				if (*(p1 + 1) == ' ')
				{
					p1 = str;
					for (;p1 < b - 1;p1++)
					{
						*p1 = (p1 + 1);
					}
					n -= 1;
				}
				else
				{
					str++;
				}
			}
			else
			{
				str++;
			}
		}
		for (p1 = a;p1 < a.Substring(n);p1++)
		{
			System.out.printf("%c",*p1);
		}
	}


}
