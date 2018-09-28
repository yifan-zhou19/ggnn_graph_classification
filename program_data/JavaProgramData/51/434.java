import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[][] w = new char[600][6];
	public static char[][] a = new char[600][6];
	public static String k = new String(new char[600]);
	public static String t = new String(new char[6]);
	public static int l;
	public static int n;
	public static int cmp(Object a, Object b)
	{
		return strcmp((String)a,(String)b);
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(k,0,(Character.SIZE / Byte.SIZE));
		k = new Scanner(System.in).nextLine();
		l = k.length();
		for (int i = 0;i < l - n + 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(w[i],k.charAt(i),(Character.SIZE / Byte.SIZE) * n);
		}
		qsort(w,l - n + 1,6 * (Character.SIZE / Byte.SIZE),cmp);
		int[] d = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(d,0,(Integer.SIZE / Byte.SIZE));
		d[0] = 1;
		int m = 1;
		for (int i = 1;i < l - n + 1;i++)
		{
			d[i] = strcmp(w[i],w[i - 1])?1:d[i - 1] + 1;
			m = Math.max(m,d[i]);
		}
		if (m == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		int tt = 0;
		for (int i = 0;i < l - n + 1;i++)
		{
			if (m == d[i])
			{
			a[tt] = w[i];
			tt++;
			}
		}
		System.out.print(m);
		System.out.print("\n");
		for (int i = 0;i < l - n + 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(t,k.charAt(i),(Character.SIZE / Byte.SIZE) * n);
			for (int j = 0;j < tt;j++)
			{
				if (!strcmp(t,a[j]))
				{
				System.out.print(t);
				System.out.print("\n");
				a[j][0] = 0;
				}
			}
		}

		return 0;
	}

}

