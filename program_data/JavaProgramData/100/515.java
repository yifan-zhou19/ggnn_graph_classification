package <missing>;

public class GlobalMembers
{
	///#include<stdafx.h>

	public static void Main()
	{
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] a = new int[26];
		int i;
		int flag;

		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';p++)
		{
			for (i = 0;i < 26;i++)
			{
				if (*p == i + 'a')
				{
					a[i]++;
				}
			}
		}
		for (i = 0,flag = 0;i < 26;i++)
		{
			if (a[i] > 0)
			{
				System.out.printf("%c=%d\n",i + 'a',a[i]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
	}
}
