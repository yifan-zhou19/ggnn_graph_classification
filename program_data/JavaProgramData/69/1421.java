import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String str1 = new String(new char[251]);
		String str2 = new String(new char[251]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int[] save1 = new int[252]; //????????????????????
		int[] save2 = new int[250];
		int len1 = str1.length();
		int len2 = str2.length();
		for (i = len1 - 1;i >= 0;i--)
		{
			save1[len1 - 1 - i] = str1.charAt(i) - '0';
		}
		for (i = len2 - 1;i >= 0;i--)
		{
			save2[len2 - 1 - i] = str2.charAt(i) - '0';
		}
		int max = (len1 > len2)?len1:len2;
		for (i = 0;i < max;i++)
		{
			save1[i] += save2[i];
			if (save1[i] >= 10)
			{
				save1[i + 1] += 1;
				save1[i] -= 10;
			}
		}
		for (i = 250;i >= 0;i--)
		{
			if (save1[i] != 0)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(save1[j]);
		}
		if (i < 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		return 0;
	}
}
