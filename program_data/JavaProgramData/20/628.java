package <missing>;

public class GlobalMembers
{
	public static int findMax(tangible.RefObject<String> str)
	{
		int i;
		int max = str.argValue;
		int ret = 0;
		for (i = 0; * (str.argValue.Substring(i));i++)
		{
			if (*(str.argValue.Substring(i)) > max)
			{
				max = (str.argValue.Substring(i)),ret = i;
			}
		}
		return ret;
	}

	public static void insert(tangible.RefObject<String> str, tangible.RefObject<String> substr, int index) //?substr???str[index]?
	{
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p;
		 //printf("%s\n",str);
		 for (p = str.argValue + str.argValue.length();p > str.argValue.Substring(index);p--)
		 {
			 *(p + substr.argValue.length()) = *p;
		 }

		 for (i = 0;i < substr.argValue.length();i++)
		 {
			 *(str.argValue.Substring(index) + 1 + i) = *(substr.argValue.Substring(i));
		 }
	}
	public static int Main()
	{
		int k;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		//freopen("input.txt","r",stdin);
		//freopen("output.txt","w",stdout);
		while (scanf("%s%s",str,substr) != EOF)
		{
		  tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			  k = findMax(tempRef_str);
			  str = tempRef_str.argValue;

		  tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str);
		  tangible.RefObject<String> tempRef_substr = new tangible.RefObject<String>(substr);
			  insert(tempRef_str2, tempRef_substr, k);
			  substr = tempRef_substr.argValue;
			  str = tempRef_str2.argValue;
			  System.out.printf("%s\n",str);
		}
		return 0;
	}

}

