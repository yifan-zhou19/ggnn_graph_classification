import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************
	//???????????                      **
	//?  ?????  1200012896                  **
	//?  ??2012.12.9                           **
	//**********************************************
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		String p = str1;
		String q = str2;
		int len;
		str1 = new Scanner(System.in).nextLine();
		len = str1.length();
		for (int i = 0; i <= len - 2; i++)
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
		*(q.Substring(len) - 1) = *(p.Substring(len) - 1) + p;
		for (int i = 0; i < len; q++, i++)
		{
			System.out.print(q);
		}
		return 0;
	}
}
