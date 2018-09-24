import java.util.*;

package <missing>;

public class GlobalMembers
{
	//33453453553
	//      34345


	public static String str1 = new String(new char[1000]);
	public static String str2 = new String(new char[1000]);
	public static int[] num1 = new int[1000];
	public static int[] num2 = new int[1000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		int i;
		for (i = 0;i < len1;i++)
		{
			num1[i] = str1.charAt(i) - '0';
		}
		for (i = 0;i < len2;i++)
		{
			num2[i] = str2.charAt(i) - '0';
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1 = num1 + len1 - 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2 = num2 + len2 - 1;
		for (i = 0;i < len2;i++)
		{
			*p1 = p1 - *p2;
			if (*p1 < 0)
			{
				*p1 = p1 + 10;
				*(p1 - 1) = *(p1 - 1) - 1;
			}
			p1--;
			p2--;
		}

		int sum = 0;
		for (i = 0;i < len1;i++)
		{
			sum = sum + num1[i];
		}
		if (sum == 0)
		{
			System.out.print("0");
			System.out.print("\n");
			return 0;
		}
		int state = 0;
		for (i = 0;i < len1;i++)
		{
			if ((state == 0) && (num1[i] != 0))
			{
					state++;
					System.out.print(num1[i]);
					continue;
			}
			if (state == 0)
			{
				if (num1[i] == 0)
				{
					continue;
				}
			}
			if (state == 1)
			{
				System.out.print(num1[i]);
			}
		}
		System.out.print("\n");
		System.in.read();
		}
		return 0;
	}



}

