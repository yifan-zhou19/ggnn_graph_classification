package <missing>;

public class GlobalMembers
{
	/*
	 * Typesetting.cpp
	 *
	 *  Created on: 2013-12-5
	 *      Author: KEVIN
	 */


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String line = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = line;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(line,'\0',81);
		while (n-- != 0)
		{
			String word = new String(new char[41]);
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len = word.length();
			if (line.length() + len > 80)
			{
				*(p - 1) = '\0'; //?line???????'\0'
				System.out.print(line);
				System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(line,'\0',81);
				p = line;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(p,word,len);
			p += len;
			*p++=' ';
		}
		if (line.length() > 0)
		{
			*(p - 1) = '\0';
			System.out.print(line);
		}
		return 0;
	}

}

