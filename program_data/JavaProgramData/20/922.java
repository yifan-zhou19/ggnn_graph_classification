package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
		String substr;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String max;
		String string;
		int i;
		int j;
		int l1;
		int l2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str = (String)calloc(15,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		substr = (String)calloc(5,(Character.SIZE / Byte.SIZE));
		while (scanf("%s%s",str,substr) != EOF)
		{
		l1 = str.length();
		l2 = substr.length();
		max = str;
		for (p = str;p - str < l1;p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		string = (String)calloc(15,(Character.SIZE / Byte.SIZE));
		for (p = str,i = 0;p <= max;p++,i++)
		{
			*(string.Substring(i)) = *p;
		}
		for (p = substr;p - substr < l2;p++,i++)
		{
			*(string.Substring(i)) = *p;
		}
		for (p = max.Substring(1);p - str < l1;p++,i++)
		{
			*(string.Substring(i)) = *p;
		}
		System.out.println(String);
		}
	}



}
