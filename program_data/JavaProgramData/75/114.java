import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[100000];
		int[] a = new int[100000];
		int i;
		int j;
		int p = 0;
		int max = 0;
		int len1;
		int len2;
		int m = 0;
		int n = 0;
		String str1 = new String(new char[100000]);
		String str2 = new String(new char[100000]);
		String strx = new String(new char[100000]);
		String stry = new String(new char[100000]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0;i < len1;i++)
		{
			while (str1.charAt(i) >= '0' && str1.charAt(i) <= '9' && i < len1)
			{
					strx = tangible.StringFunctions.changeCharacter(strx, m, str1.charAt(i));
					i++;
					m++;
			}
			strx = tangible.StringFunctions.changeCharacter(strx, m, '\0');
			a[p] = Integer.parseInt(strx);
			p++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(strx,0,100000);
			m = 0;
		}
		for (i = 0;i < len2;i++)
		{
			while (str2.charAt(i) >= '0' && str2.charAt(i) <= '9' && i < len2)
			{
					stry = tangible.StringFunctions.changeCharacter(stry, n, str2.charAt(i));
					i++;
					n++;
			}
			stry = tangible.StringFunctions.changeCharacter(stry, n, '\0');
			a[p] = Integer.parseInt(stry);
			p++;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(stry,0,100000);
			n = 0;
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < p / 2;j++)
			{
					if (a[j] <= i != 0 && i < a[j + p / 2])
					{
					count[i]++;
					}
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(p / 2);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

