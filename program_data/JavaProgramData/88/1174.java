import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[31]);
		char[][] num = new char[30][10];
		int s = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		c = new Scanner(System.in).nextLine(); //??
		p = c;
		q = num[s];
		while (true)
		{
			if (*p == '\0') //??
			{
				*q = '\0';
				s++;
				break;
			}
			if (*p - '0' < 10 && *p - '0' >= 0) //???????
			{
				*q = p;
				p++;
				q++;
				continue;
			}
			if (*(p - 1) - '0' < 10 && *(p - 1) - '0' >= 0 && *p - '0' >= 10 || *p - '0' < 0)
			{
				*q = '\0';
				q = num[++s];
				p++;
				continue;
			}
			else
			{
				p++; //????
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.print(num[i]);
			System.out.print("\n");
		}
		return 0;
	}
}
