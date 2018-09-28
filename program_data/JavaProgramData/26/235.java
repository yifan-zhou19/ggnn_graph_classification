import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************
	//* file : 1000012912_001.cpp                *
	//* author : ???                          *
	//* data : 2010.12.8                         *
	//* function : ??????                  *
	//********************************************
	public static int Main()
	{
		int num; //len?????
		int i;
		int j;
		int len;
		String str = new String(new char[101]); //p?str??
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (j = 0; j < len ; j++)
		{
			p = str.Substring(j);
			num = -1;
			while (*p == ' ')
			{
				num++; //num????-1
				p++;
			}
			if (num > 0)
			{
				for (i = p - str; i < len; i++)
				{
					*(p - num) = *p++; //??
				}
				len -= num; //??????
			}
		}
		str = tangible.StringFunctions.changeCharacter(str, len, '\0'); //???0
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}










}

