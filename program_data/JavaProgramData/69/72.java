import java.util.*;

package <missing>;

public class GlobalMembers
{
	//POJ ?? 2981 ?????
	public static int Main()
	{
		String A = new String(new char[300]);
		String B = new String(new char[300]);
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[320];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(A,' ',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(B,' ',(Character.SIZE / Byte.SIZE));
		A = new Scanner(System.in).nextLine();
		B = new Scanner(System.in).nextLine();
		int x = A.length();
		int y = B.length();
		for (int i = x - 1; i >= 0 ; i--)
		{
			if (A.charAt(i) == ' ')
			{
				;
			}
			else
			{
				a[x - i] = A.charAt(i) - '0'; //??A?(?A[0]??)123456??a?(?a[0]??)0654321
			}
		}
		for (int j = y - 1; j >= 0 ; j--)
		{
			if (B.charAt(j) == ' ')
			{
				;
			}
			else
			{
				b[y - j] = B.charAt(j) - '0';
			}
		}
		for (int k = 0 ; k < x + y ; k++)
		{
			c[k] += a[k] + b[k];
			c[k + 1] += c[k] / 10;
			c[k] %= 10;
		}
		int remember = 0;
		for (int l = x + y ; l >= 0 ; l--)
		{
			if (c[l] != 0)
			{
				remember = l;
				break;
			}
		}
		for (int m = remember ; m > 0 ; m--)
		{
			System.out.print(c[m]);
		}
		if (remember == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		return 0;
	}
}
