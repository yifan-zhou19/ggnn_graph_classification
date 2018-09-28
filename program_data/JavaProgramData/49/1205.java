package <missing>;

public class GlobalMembers
{
	public static void fanxu(tangible.RefObject<String> p, int len)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * l;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m;
		char c;
		for (l = p.argValue,m = p.argValue.Substring(len) - 1;l < m;l++,m--)
		{
			c = m;
			*m = l;
			*l = c;
		}
	}
	public static int compare(tangible.RefObject<String> p1, tangible.RefObject<String> p2, int length)
	{
		int w;
		int exist = 1;
		for (w = 0;w <= length - 1;w++)
		{
			if (*(p1.argValue.Substring(w)) != *(p2.argValue.Substring(w)))
			{
				exist = 0;
			}
		}
		return exist;
	}
	public static int Main()
	{
		String char_array = new String(new char[500]);
		String store1 = new String(new char[500]);
		String store2 = new String(new char[500]);
		String p;
		char_array = new Scanner(System.in).nextLine();
		p = char_array;
		int len;
		int i;
		int j;
		int k;
		len = char_array.length();
		for (k = 0;k <= 499;k++)
		{
			store1 = tangible.StringFunctions.changeCharacter(store1, k, '\0');
			store2 = tangible.StringFunctions.changeCharacter(store2, k, '\0');
		}
		for (i = 2;i <= len;i++)
		{
			for (p = char_array;p <= char_array.Substring(len) - i;p++)
			{
				for (k = 0;k <= i - 1;k++)
				{
					store1 = tangible.StringFunctions.changeCharacter(store1, k, *(p.Substring(k)));
					store2 = tangible.StringFunctions.changeCharacter(store2, k, store1.charAt(k));
				}
			tangible.RefObject<String> tempRef_store1 = new tangible.RefObject<String>(store1);
				fanxu(tempRef_store1, i);
				store1 = tempRef_store1.argValue;
				//printf("str1=");
				//puts(store1);
				//printf("str2=");
				///puts(store2);
			tangible.RefObject<String> tempRef_store12 = new tangible.RefObject<String>(store1);
			tangible.RefObject<String> tempRef_store2 = new tangible.RefObject<String>(store2);
				if (compare(tempRef_store12, tempRef_store2, i) == 1)
				{
					store2 = tempRef_store2.argValue;
					store1 = tempRef_store12.argValue;
					System.out.println(store2);
				}
				else
				{
					store2 = tempRef_store2.argValue;
					store1 = tempRef_store12.argValue;
				}
			}
		}
	}


}

