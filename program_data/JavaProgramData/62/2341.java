import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p; //???????????????
		a = new Scanner(System.in).nextLine(); //???????
		n = a.length(); //???????
		p = a;
		while (*p == ' ') //????????????
		{
			p = p + 1;
		}
		System.out.print(p);
		p++;
		for (p;p < a.Substring(n);p++) //????????????????????
		{
			if (*(p - 1) != ' ' || *p != ' ')
			{
				System.out.print(p);
			}
		}
		return 0;
	}

}
