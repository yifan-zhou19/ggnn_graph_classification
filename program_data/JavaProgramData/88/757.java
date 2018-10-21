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
		char * str; // str?????????,???????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String a;
		int m; //a????????,
		int k;
		str = getmemory(31); //p1??????????
		str = new Scanner(System.in).nextLine();
		p1 = a = str; //m???????????
		k = 0; // k????????????
		for (; * str != '\0';)
		{
			if (*str < '0' || *str>'9') //???????
			{
				k += 1;
				if (*(str + 1) >= '0' && *(str + 1) <= '9') //????????
				{ //????????
					m = str - k - p1;
					if (p1 == a)
					{
						for (;p1 <= str - k;p1++)
						{
							System.out.printf("%c",*p1);
						}
						System.out.print("\n");
					}
					else
					{
						for (p1 = p1 + 1;p1 <= str - k;p1++)
						{
							System.out.printf("%c",*p1);
						}
						System.out.print("\n");
					}
					p1 = str;
					k = 0;
				}
			}
			str++;
		}
		if (p1 == a)
		{
			for (;p1 < str - k;p1++)
			{
				System.out.printf("%c",*p1); //??????????????
			}
		}
		else
		{
			for (p1 = p1 + 1;p1 < str - k;p1++)
			{
				System.out.printf("%c",*p1); //????????
			}
		}

	}
}
