import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
		int j;
		int len1;
		int len2;
		int len;
		char flag; //???????????
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //???????
			for (i = 0;str1.charAt(i) != '\0';i++) //???????
			{
				len1 = i + 1;
			}
			for (j = 0;str2.charAt(j) != '\0';j++)
			{
				len2 = i + 1;
			}
			if (len1 < len2)
			{
				len = len1;
			}
			else
			{
				len = len2;
			}
			for (i = 0;i < len;i++)
			{
				if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122)
				{
					str1.charAt(i) -= 32; //?ASC???????
				}
			}
			for (i = 0;i < len;i++)
			{
				if (str2.charAt(i) >= 97 && str2.charAt(i) <= 122)
				{
					str2.charAt(i) -= 32;
				}
			}
			for (i = 0;i < len;i++) //??????
			{
				if (str1.charAt(i) == str2.charAt(i))
				{
					flag = '=';
				}
				else if (str1.charAt(i) < str2.charAt(i))
				{
					flag = '<';
					break;
				}
					else
					{
					  flag = '>';
					  break;
					}
			}
			System.out.print(flag);
			System.out.print("\n");
		return 0;
	}
}
