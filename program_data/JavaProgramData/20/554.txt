package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'str', so pointers on this parameter are left unchanged:
	public static int MaxIndex(char * str)
	{
		char maxChar = 0;
		int i = 0;
		int j = 0;
		while (*str != 0)
		{
			if (maxChar < *str)
			{
				maxChar = str;
				i = j;
			}
			j++;
			str = str.Substring(1);
		}
		return i;
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'str', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'substr', so pointers on this parameter are left unchanged:
	public static void fun(char * str, char * substr)
	{
		int max = MaxIndex(str);
		str += max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp = str;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (*(temp++) != 0)
		{
			;
		}
		*(temp + 3) = 0;
		while ((--temp) != str)
		{
			*(temp + 3) = *temp;
		}
		while (*substr != 0)
		{
			*(++temp) = *substr++;
		}
	}
	public static int Main()
	{
		String str = new String(new char[16]);
		String substr = new String(new char[4]);
		int i;
		int lenth;
		int maxAsc = 0;
		char maxChar = 0;
		while (scanf("%s%s",str,substr) == 2)
		{
			fun(str, substr);
			System.out.printf("%s\n",str);
		}
	}

}
