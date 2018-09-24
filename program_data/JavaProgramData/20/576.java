package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String index;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * i;
		int max;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[5]);
		while (scanf("%s%s", str1, str2) != EOF)
		{
			max = 0;
			for (i = str1; * i != '\0';i++)
			{
				if (*i > max)
				{
					max = i,index = i;
				}
			}
			for (i = str1;i <= index;i++)
			{
				System.out.printf("%c",*i);
			}
			System.out.printf("%s",str2);
			for (i = index.Substring(1); * i != '\0';i++)
			{
				System.out.printf("%c",*i);
			}
			System.out.print("\n");
		}

	}
}
