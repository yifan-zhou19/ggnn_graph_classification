import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*????2.cpp
	  ???2012?12?25?
	  ????? 1? 1200012895
	  ???????
	  */
	public static int Main()
	{
		String a = new String(new char[260]); //a??????b????c?????
		String b = new String(new char[260]);
		String c = new String(new char[260]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * k;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int lena = a.length(); //lena?a????lenb?b????flag??a????b?t??????
		int lenb = b.length();
		int flag = 0;
		int t = 0;
		int i;
		p = a;
		q = a;
		k = b;
		while (*p != '\0') //??p????'\0'??????
		{
			if (*q == *k) //?????a?b?????
			{
				q++; //????????
				k++;
				if (*k == '\0') //??b?????
				{
					flag = 1; //?????????
					for (i = 0; i < t; i++)
					{
						System.out.print(a.charAt(i));
					}
					System.out.print(c);
					for (i = t + lenb; a.charAt(i) != '\0'; i++)
					{
						System.out.print(a.charAt(i));
					}
					System.out.print("\n");
					break;
				}
			}
			else //??p???????q??p????k????b
			{
				p++;
				q = p;
				k = b;
				t++; //??b????1
			}
		}
		if (flag == 0) //???????????????????
		{
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}
}
