package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		char a[50];
	//	}
	//	words[50];
		int i;
		int j;
		int[] e = new int[50];
		String f = new String(new char[2600]);
		f = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * o;
		o = f;
		for (; * o != '\0';o++)
		{
			if (*o == ' ')
			{
				j++;
			}
		}
		j = j + 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = f;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (i = 0;i < j;i++)
		{
			q = words[i].a;
			for (; * p != ' ' && *p != '\0';p++, q++)
			{
				*q = p;
			}
			*q = '\0';
			if (*p != '\0')
			{
				p++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
			e[i] = String.valueOf(words[i].a).length();
		}
		int c = 0;
		int d = 50;
		for (i = 0;i < j;i++)
		{
			if (e[i] > c)
			{
				c = e[i];
			}
			if (e[i] < d)
			{
				d = e[i];
			}
		}
		for (i = 0;i < j;i++)
		{
			if (e[i] == c)
			{
				System.out.printf("%s\n",words[i].a);
				break;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (e[i] == d)
			{
				System.out.printf("%s\n",words[i].a);
				break;
			}
		}
		return 0;
	}


}
