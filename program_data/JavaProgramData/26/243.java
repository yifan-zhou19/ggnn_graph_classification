import java.util.*;

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void filter(char * p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = null;
		p1 = p;
		while (*p != 0)
		{
			while ((*p != ' ') && (*p != 0))
			{

				*p1 = p;
				System.out.print(p1);
				p1++;
				p = p.Substring(1);
			}
			while ((*p == ' '))
			{
				p = p.Substring(1);
			}
			if ((p - p1 > 0) && (*p != 0))
			{
				*p1++= *(p - 1);
				System.out.print((p1 - 1));
				//*p1 = *p;
				//cout << *p1<<2;
			}
		}
		System.out.print("\n");
		//cout << *p << endl;
		//cout << p1 << endl;
		return;
	}
	public static int Main()
	{
		String str = new String(new char[105]);
		str = new Scanner(System.in).nextLine();
		filter(str);
	//	cout << str << endl;

		return 0;
	}
}
