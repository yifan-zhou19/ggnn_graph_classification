import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int longest = 0;
		int shortest = 15;
		String a = new String(new char[201]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		String longplace;
		String shortplace;
		a = new Scanner(System.in).nextLine();
		while (*p != '\0')
		{
			num = 0;
			while (*p != ' ' && *p != ',' && *p != '\0')
			{
				num++;
				p++;
			}
			if (num > longest)
			{
				longest = num;
				longplace = p - num;
			}
			if (num < shortest)
			{
				shortest = num;
				shortplace = p - num;
			}
			if (*p != '\0')
			{
				p++;
			}
			if (*p == ' ')
			{
				p++;
			}
		}
		for (p = longplace; p <= longplace.Substring(longest) - 1; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		for (p = shortplace; p <= shortplace.Substring(shortest) - 1; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");

		return 0;
	}










}
