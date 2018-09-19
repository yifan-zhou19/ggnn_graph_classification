package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<String> str, tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = str.argValue;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = a.argValue;
		int len1;
		int len2;
		int len3;
		int n;
		int i = 0;
		int j;
		int k;
		int m;
		len1 = str.argValue.length();
		len2 = a.argValue.length();
		len3 = b.argValue.length();
		n = len3 - len2;
		while (*p1 != '\0')
		{
			if ((*p1 == *p2) && (!Character.isLetter(*(p1 - 1))))
			{
				while ((*p1 == *p2) && (*p2 != '\0'))
				{
					p1++,p2++;
					i++;
				}
			}
				else
				{
					p1++;
					i++;
				}
				if ((*p2 == '\0') && Character.isLetter(*p1) == 0)
				{
					if (n < 0)
					{
						j = i - len2;
						for (k = 0;k < len3;k++)
						{
							str.argValue.charAt(j++) = b.argValue.charAt(k);
						}
						for (m = i;m < len1;m++)
						{
							str.argValue.charAt(j++) = str.argValue.charAt(m);
						}
						while (j < len1)
						{
							str.argValue.charAt(j++) = '\0';
						}
						len1 = str.argValue.length();
					}
					else
					{

						for (m = len1 + n;m > i;m--)
						{
							str.argValue.charAt(m) = str.argValue.charAt(len1--);
						}
						j = i - len2;
						for (k = 0;k < len3;k++)
						{
							str.argValue.charAt(j++) = b.argValue.charAt(k);
						}
							len1 = str.argValue.length();
					}
				}
				p2 = a.argValue;
		}
	}
	public static void Main()
	{
	   String str = new String(new char[1000]);
	   String a = new String(new char[200]);
	   String b = new String(new char[200]);
	   str = new Scanner(System.in).nextLine();
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
   tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
   tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
   tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	   swap(tempRef_str, tempRef_a, tempRef_b);
	   b = tempRef_b.argValue;
	   a = tempRef_a.argValue;
	   str = tempRef_str.argValue;
	   System.out.println(str);
	}




}

