import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[100];
		int z = -1;
		String b = new String(new char[100]);
		b = new Scanner(System.in).nextLine();
		char c = b.charAt(0);
		for (int i = 0;b.charAt(i) != 0;++i)
		{
			if (b.charAt(i) == c)
			{
				a[++z] = i;

			}
			else
			{
				System.out.print(a[z]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				--z;
			}
		}
		return 0;
	}


}
