import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String b = new String(new char[2]);
		b = new Scanner(System.in).nextLine();
		String a = new String(new char[5000]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int sum = 0; //????????????
		int single = 0;
		for (p = a; * p != ' ';p++)
		{
			System.out.print(p);
		}
		sum = p - a;
		for (int i = 1;i < n;i++)
		{
			single = 0;
			q = p + 1;
			for (p++; * p != ' ' && *p != '\0';p++)
			{
				single++;
			}
			sum += single+1;
			if (sum <= 80)
			{
				System.out.print(' ');
			}
			else
			{
				System.out.print("\n");
				sum = single;
			}
			if (i < n - 1)
			{
				for (; * q != ' ';q++)
				{
					System.out.print(q);
				}
			}
			else
			{
				for (; * q != '\0';q++)
				{
					System.out.print(q);
				}
			}
		}
		return 0;
	}
}

