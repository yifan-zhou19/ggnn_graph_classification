import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***************************
	//*???n-gram????    **
	//*????? 1300012921   **
	//*???2013.12.18        **
	//*************************** 

	public static String ch = new String(new char[520]);
	public static int n;

	public static int Main()
	{
		char[][] zichuan =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int[] zichuanshu = new int[520];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int flag1;
		int flag2;
		int dijige = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		ch = new Scanner(System.in).nextLine();
		for (q = ch; * (q + n - 1) != '\0'; q++)
		{
			flag2 = 1; //???????????????
			for (p = q; * (p + n - 1) != '\0'; p++)
			{
				if (*p == *q)
				{
					flag1 = 1;
					for (int i = 2; i <= n; i++)
					{
						if (*(p + i - 1) != *(q + i - 1))
						{
							flag1 = 0;
							break;
						}
					} // ???p?????????????????
					if (flag1 != 0)
					{
						if (flag2 != 0)
						{
							for (int i = 0; i < n; i++)
							{
								*(zichuan[dijige] + i) = *(p + i);
							}
							flag2 = 0;
						}

						zichuanshu[dijige]++;
					}
				}
			}
			dijige++;
		}
		int max = 1;
		for (int i = 0; i <= 519; i++)
		{
			if (zichuanshu[i] > max)
			{
				max = zichuanshu[i];
			}
		}

		if (max > 1)
		{
			System.out.print(max);
			System.out.print("\n");
			for (int i = 0; i <= 519; i++)
			{
				if (zichuanshu[i] == max)
				{
					for (int j = 0; j < n; j++)
					{
						System.out.print((zichuan[i] + j));
					}
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

