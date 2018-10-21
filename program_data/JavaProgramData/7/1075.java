package <missing>;

public class GlobalMembers
{
	public static String str_replace(String src, String oldstr, String newstr)
	{

		if (src == null || oldstr == null || newstr == null)

		{

				return null;

		}



		//????????????

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *dest=strdup(src);
		char dest = src;

		//???????????

		if (strcmp(oldstr, newstr) == 0)

		{

				return dest;

		}



		//??????

		String needle;

		//?????

		String tmp;
		String dest_tmp = dest;





		//??????, ????????len??????, ?????, ??????

		while (needle = tangible.StringFunctions.strStr(dest, oldstr))

		{



			//??????: +1 ????????'\0'???

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			tmp = (String)malloc(dest.length() + newstr.length() - oldstr.length() + 1);



			//?src???needle-dest????????????arr

			tmp = dest.substring(0, needle - dest);



			//?????

			tmp = tangible.StringFunctions.changeCharacter(tmp, needle - dest, '\0');



			//??arr?newstr, ??newstr??arr??, ??????(??????)arr

			tmp += newstr;



			//?src? ?oldstr?????????arr??????????arr

			tmp += needle + oldstr.length();



			//??malloc???????????retv

			dest = tmp;



//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(dest_tmp);

			//??malloc???????

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(tmp);

			dest_tmp = dest;

		}

		return dest;

	}
	public static int Main()
	{
		int aa = 0;
		int i;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		char[] sub = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] sub1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] sub2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		if (str1.length() < str2.length())
		{
			System.out.print(str1);
		}
		else
		{
			for (i = 0;i <= str1.length() - str2.length();i++)
			{
				sub = str1.substring(i, i + str2.length());
				if (strcmp(sub,str2) == 0)
				{
					sub1 = str1.substring(0, i);
					sub2 = str1.substring(i + str2.length(), i + str2.length() + str1.length() - i - str2.length());
					sub1 += str3;
					sub1 += sub2;
					System.out.print(sub1);
					aa = 1;
					break;
				}
			}
			if (aa == 0)
			{
				System.out.print(str1);
			}
		}

		return 0;
	}


}

