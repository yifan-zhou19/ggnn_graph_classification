import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*?????13
	  ??????
	  ???1100012802*/
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] q = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			q[i] = a.charAt(i) - '0';
		}
		for (i = 0;a.charAt(i + 1) != '\0';i++)
		{
			q[i + 1] = 10 * q[i] + q[i + 1];
			b[i] = q[i + 1] / 13;
			q[i + 1] = q[i + 1] % 13;
		}
		if (i == 0)
		{
			System.out.print(0);
		}
		else if (i == 1 || b[0] != 0)
		{
			System.out.print(b[0]);
		}
		for (j = 1;j <= i - 1;j++)
		{
			System.out.print(b[j]);
		}
		System.out.print("\n");
		System.out.print(q[i]);
		return 0;
	}
}
