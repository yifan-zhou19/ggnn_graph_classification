import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int m;
		int[] c = new int[255];
		int[] q = c;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (p = a; * p != '\0';)
		{
			p++;
		}
		m = a.Substring(252) - p;
		for (;p >= a;p--)
		{
			*(p + m) = *p;
		}
		p += m;
		for (;p >= a;p--)
		{
			*p = '0';
		}
		for (p = b; * p != '\0';)
		{
			p++;
		}
		m = b.Substring(252) - p;
		for (;p >= b;p--)
		{
			*(p + m) = *p;
		}
		p += m;
		for (;p >= b;p--)
		{
			*p = '0';
		}
		for (i = 0;i < 253;i++)
		{
			c[i] = a.charAt(i) + b.charAt(i) - 96;
		}
		for (i = 252;i > 0;i--)
		{
			if (c[i] > 9)
			{
				c[i] -= 10;
				c[i - 1]++;
			}
		}
		while (q[0] == 0)
		{
			q++;
		}
		if (q >= c + 252)
		{
			System.out.print("0");
		}
		while (q < c + 252)
		{
			System.out.print(q++);
		}
		System.out.print("\n");
		return 0;
	}
}
