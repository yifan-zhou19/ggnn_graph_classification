import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000]; //??????
		int[] y = new int[1000];
		int[] t = new int[1000];
		String c = new String(new char[10000]); //??????
		String d = new String(new char[10000]);
		char[][] num = new char[10000][10];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int s = 0;
		int m = 0;
		int n = 0;
		int i;
		int j;
		c = new Scanner(System.in).nextLine();
		p = c;
		q = num[s];
		while (true)
		{
			if (*p == '\0') //??
			{
				*q = '\0';
				s++;
				break;
			}
			if (*p == ',') //????
			{
				*q = '\0';
				q = num[++s];
				p++;
			}
			else //????
			{
				*q = p;
				p++;
				q++;
			}
		}
		for (i = 0;i < s;i++) //?????
		{
			x[i] = Integer.parseInt(num[i]);
		}
		s = 0;
		d = new Scanner(System.in).nextLine();
		p = d;
		q = num[s];
		while (true)
		{
			if (*p == '\0') //??
			{
				*q = '\0';
				s++;
				break;
			}
			if (*p == ',') //????
			{
				*q = '\0';
				q = num[++s];
				p++;
			}
			else //????
			{
				*q = p;
				p++;
				q++;
			}
		}
		for (i = 0;i < s;i++) //?????
		{
			y[i] = Integer.parseInt(num[i]);
		}
		for (i = 0;i < s;i++) //??????
		{
			if (y[i] > m)
			{
				m = y[i];
			}
		}
		for (i = 0;i < m;i++) //?????
		{
			t[i] = 0;
		}
		for (i = 0;i < s;i++) //???????+1
		{
			for (j = x[i];j < y[i];j++)
			{
				t[j]++;
			}
		}
		for (i = 0;i < m;i++) //??????
		{
			if (t[i] > n)
			{
				n = t[i];
			}
		}
		System.out.print(s);
		System.out.print(" ");
		System.out.print(n);
		System.out.print("\n");
		return 0;
	}
}
