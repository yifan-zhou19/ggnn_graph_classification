import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   final int maxlen = 250;
	   int[] an1 = new int[maxlen];
	   int[] an2 = new int[maxlen];
	   String str1 = new String(new char[maxlen + 1]);
	   String str2 = new String(new char[maxlen + 1]);
	   str1 = new Scanner(System.in).nextLine();
	   str2 = new Scanner(System.in).nextLine();
	   int len1 = str1.length();
	   int len2 = str2.length();
	   if (len1 == 1 && len2 == 1 && str1.charAt(0) == '0' && str2.charAt(0) == '0')
	   {
		   System.out.print(0);
		   System.out.print("\n");
	   }
	   else
	   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(an2,0,(Integer.SIZE / Byte.SIZE));
	   int i;
	   int j = 0;
	   for (int i = len1 - 1;i >= 0;i--)
	   {
		   an1[j++] = str1.charAt(i) - '0';
	   }
	   j = 0;
		for (int i = len2 - 1;i >= 0;i--)
		{
		   an2[j++] = str2.charAt(i) - '0';
		}
		for (int i = 0;i < maxlen;i++)
		{
			an1[i] = an1[i] + an2[i];
			if (an1[i] > 9)
			{
				an1[i] = an1[i] - 10;
				an1[i + 1]++;
			}
		}
		i = maxlen - 1;
		while (an1[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(an1[i]);
		}
		System.out.print("\n");
	   }
	return 0;
	}

}
