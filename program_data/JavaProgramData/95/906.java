import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 * ???1.cpp
	 * ?????????????
	 * ??????
	 * ???2010?11?17?
	 */
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		int flag;
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		a = new Scanner(System.in).nextLine(); //????????
		b = new Scanner(System.in).nextLine();
		len1 = a.length(); //?len1,len2????????????
		len2 = b.length();
		for (i = 0;i < len1;i++) //????????????????
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a.charAt(i) += 32;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b.charAt(i) += 32;
			}
		}
		for (i = 0;i < len1 && i < len2;i++) //????????????
		{
			flag = 0; //????????0
			if (a.charAt(i) == b.charAt(i))
			{
				continue;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				flag = 1; //??a???????flag=1
			 break;
			}
			else
			{
				flag = 2; //??b???????flag=2
			  break;
			}
		}
		if (flag == 0)
		{
			System.out.print('=');
			System.out.print("\n");
		}
		if (flag == 1)
		{
			System.out.print('>');
			System.out.print("\n");
		}
		if (flag == 2)
		{
			System.out.print('<');
			System.out.print("\n");
		}
	return 0;
	}
}
