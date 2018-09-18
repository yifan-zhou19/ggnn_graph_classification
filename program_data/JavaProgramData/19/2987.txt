import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]); //????
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char[][] d =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j = 0;
		int k = 0;
		int l;
		a = new Scanner(System.in).nextLine(); //??????
		b = new Scanner(System.in).nextLine(); //????????
		c = new Scanner(System.in).nextLine(); //????????
		l = a.length();
		for (i = 0;i < l;i++)
		{
			d[j][k] = a.charAt(i);
			k = k + 1;
			if (a.charAt(i + 1) == ' ' || i == l - 1)
			{
				j = j + 1,k = 0,i = i + 1;
			}
		} //?a?????????d[j]
		for (i = 0;i < j;i++)
		{
			if (strcmp(d[i],b) == 0)
			{
				d[i] = c; //??d????
			}
		}
		System.out.print(d[0]);
		for (i = 1;i < j;i++)
		{
			System.out.print(" ");
			System.out.print(d[i]);
		}
		return 0;
	}
}
