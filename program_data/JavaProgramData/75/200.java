import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		String b = new String(new char[100000]);
		int[] count = new int[1000];
		int i;
		int[] c = new int[1000];
		int[] d = new int[1000];
		int k = 0;
		int m = 0;
		int max = 0;
		int j;
		int ii;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c[k++] = Integer.parseInt(a);
		d[m++] = Integer.parseInt(b);
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == ',')
			{
				c[k++] = Integer.parseInt(a.Substring(i) + 1);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) == ',')
			{
				d[m++] = Integer.parseInt(b.Substring(i) + 1);
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = c[i];j < d[i];j++)
			{
				count[j]++;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				ii = i;
			}
		}
		System.out.print(k);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}
