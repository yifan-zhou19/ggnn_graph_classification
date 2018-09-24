package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ip;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		char max;
		int i;
		while (scanf("%s%s",str,substr) != EOF)
		{
			for (max = str,ip = str,p = str; * p != '\0';p++)
			{
			if (*p > max)
			{
				max = p;
				ip = p;
			}
			}
			ip = ip + 1;

			for (p = str + str.length();p >= ip;p--)
			{
				*(p + 3) = *p;
			}

			for (p3 = substr,i = 0;i < 3;i++,p3++,ip++)
			{
				*ip = p3;
			}
			System.out.printf("%s\n",str);
			str = "";
		}
	}

}
