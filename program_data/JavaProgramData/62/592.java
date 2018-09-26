package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;

		String str;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		str = new Scanner(System.in).nextLine();
		for (p = str,i = 0;p < str + str.length();p++,i++)
		{
			if (*(p - 1) == ' ' && *(p) == ' ')
			{
				for (j = i - 1;j < str.length();j++)
				{
					*(str.Substring(j)) = *(str.Substring(j) + 1);
				}
				//*(str+strlen(str)-1)=' ';
				i--;
			  p = str.Substring(i);
				//printf("%c",*p);

			}
		}
			System.out.println(str);

	}

}
