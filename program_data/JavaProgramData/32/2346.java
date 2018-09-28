import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**************************************
	//*  ????4.cpp                     *
	//*  ??????                      *
	//*  ?????2013?11?16?          *
	//*  ????????                  *
	//**************************************

	public static int Main()
	{
		final int N = 110;
		int T;
		int i;
		int l1;
		int l2;
		int tw = 0;
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		String s1 = new String(new char[N]);
		String s2 = new String(new char[N]);
		T = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (T-- != 0)
		{
			s1 = new Scanner(System.in).nextLine();
			s2 = new Scanner(System.in).nextLine();
			l1 = s1.length();
			l2 = s2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i <= l1;i++)
			{
				a[N - i] = s1.charAt(l1 - i) - '0';
			}
			for (i = 1;i <= l2;i++)
			{
				b[N - i] = s2.charAt(l2 - i) - '0';
			}
			for (i = N - 1;i >= N - l1;i--)
			{
				c[i] = a[i] - b[i] - tw;
				if (c[i] < 0)
				{
					c[i] += 10;
					tw = 1;
				}
				else
				{
					tw = 0;
				}
			}
			while (c[i] == 0)
			{
				i++;
			}
			for (;i < N;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
			System.in.read();
		}
		return 0;
	}

}

