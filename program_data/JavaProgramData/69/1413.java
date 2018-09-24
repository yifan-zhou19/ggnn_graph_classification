import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[266];
		int[] a2 = new int[266];
		int len1;
		int len2;
		String b1 = new String(new char[266]);
		String b2 = new String(new char[266]);
		b1 = new Scanner(System.in).nextLine();
		b2 = new Scanner(System.in).nextLine();
		len1 = b1.length(); //??
		len2 = b2.length();
		if (len1 == 1 && len2 == 1 && b1.charAt(0) == '0' && b2.charAt(0) == '0')
		{
		System.out.print(0);
		System.out.print("\n");
		}
		else
		{
			 int i = 0;
			 int j = 0;
		for (i = len1 - 1;i >= 0;i--)
		{
		  a1[j++] = b1.charAt(i) - '0'; //???????????
		}
		j = 0;
		for (i = len2 - 1;i >= 0;i--)
		{
		  a2[j++] = b2.charAt(i) - '0';
		}
		for (i = 0;i <= 266;i++)
		{
		   a1[i] += a2[i];
		   if (a1[i] >= 10)
		   {
			  a1[i] -= 10;
			  a1[i + 1]++;
		   }
		}
		i = 265;
		while (a1[i] == 0)
		{
			i--;
		}
		for (;i >= 0;i--)
		{
		System.out.print(a1[i]);
		}
		System.out.print("\n");
		}
		return 0;
	}


}
