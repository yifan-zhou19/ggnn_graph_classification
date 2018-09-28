import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int la;
		int lb;
		int l;
		int[] a2 = new int[251];
		int[] b2 = new int[251];
		int[] result = new int[251];
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		if (la > lb)
		{
			l = la;
		}
		else
		{
			l = lb;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b2,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < la;i++)
		{
			a2[i] = a.charAt(la - i - 1) - 48;
		}
		for (i = 0;i < lb;i++)
		{
			b2[i] = b.charAt(lb - i - 1) - 48;
		}
		for (i = 0;i < l;i++)
		{
			result[i] = result[i] + a2[i] + b2[i];
			if (result[i] >= 10)
			{
				result[i] = result[i] - 10;
				result[i + 1]++;
			}
		}
		if ((a2[0] == 0) && (b2[0] == 0))
		{
			System.out.print('0');
		}
		else
		{
			for (i = 250;i > 0;i--)
			{
				if (result[i] != 0)
				{
					break;
				}
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(result[j]);
			}
		}

		return 0;
	}








}
