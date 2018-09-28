import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[201]);
		char b;
		int i;
		int j;
		int k;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length(); //????????????
		p = a; //p????????
		for (i = 0;i < len;i++)
		{
			if (*p != ' ')
			{
				System.out.print(p);
				p++;
				j = 0; //???????????????j ??0
			}
			else
			{
				if (j == 0)
				{
					System.out.print(' ');
				}
					p++;
					j = 1; //??????????????????j??1
			}
		}
		System.out.print("\n");
		return 0;
	}
}
