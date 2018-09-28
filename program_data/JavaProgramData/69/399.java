import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[201]);
	public static String s2 = new String(new char[201]);
	public static int[] a1 = new int[201];
	public static int[] a2 = new int[201];
	public static int nlen1;
	public static int nlen2;
	public static int Main()
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		nlen1 = s1.length();
		nlen2 = s2.length();
		j = 0;
		for (i = nlen1 - 1; i >= 0; i--)
		{
			a1[j++] = s1.charAt(i) - '0';
		}
		j = 0;
		for (i = nlen2 - 1; i >= 0; i--)
		{
			a2[j++] = s2.charAt(i) - '0';
		}
		for (i = 0; i <= 200; i++)
		{
			a1[i] += a2[i];
		}
		for (i = 0; i <= 200; i++)
		{
			if (a1[i] >= 10)
			{
				a1[i] -= 10;
				a1[i + 1]++;
			}
		}
		i = 200;
		while (a1[i] == 0)
		{
			i--;
		}
		if (i < 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			j = i;
			for (i = j;i >= 0;i--)
			{
				System.out.print(a1[i]);
			}
			System.out.print("\n");
		}
		//cin>>i;
		return 0;
	}
}
