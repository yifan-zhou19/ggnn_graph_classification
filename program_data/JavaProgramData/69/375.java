import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[252]);
		String str2 = new String(new char[252]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[251]={0},b[251]={0};
		int[] a = new int[251];
		int[] b = new int[251];
		int len1 = str1.length();
		int len2 = str2.length();
		int i;
		int j = 0;
		//????????0
		for (i = len1 - 1;i >= 0;i--)
		{
			a[j++] = str1.charAt(i) - '0';
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
			b[j++] = str2.charAt(i) - '0';
		}
		if (strcmp(str1,"0") != 0 && strcmp(str2,"0") != 0)
		{
		for (i = 0;i <= 250;i++)
		{
			a[i] = a[i] + b[i];
			if (a[i] >= 10)
			{
				a[i] = a[i] - 10;
				a[i + 1]++;
			}
		}
		for (i = 250;i >= 0;i--)
		{
			if (a[i] != 0) //????0?????
			{
				break;
			}
		}
		for (;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		}
		else
		{
			System.out.print(0);
		}
		return 0;
	}
}
