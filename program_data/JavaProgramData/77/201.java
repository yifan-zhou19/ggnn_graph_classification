import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[100]; //?????????????
	public static char boy;
	public static char girl;
	public static String a = new String(new char[100]);
	public static void f()
	{
		int k = 1;
		int i;
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == boy && c[i] == 0) //?????????
			{
				while (c[i + k] == 1)
				{
					k++;
				} //?????
			  if (a.charAt(i + k) == girl)
			  {
				  System.out.print(i);
				  System.out.print(' ');
				  System.out.print(i + k);
				  System.out.print("\n");
				  c[i] = 1;
				  c[i + k] = 1;
				  break;
			  } //???????????????????break
			  else
			  {
				  k = 1;
				  continue;
			  } //??????k?????1?????

			}
		}
		if (i + k < a.length() - 1)
		{
			f(); //???????????????????f
		}
	}

	public static int Main()
	{
		a = new Scanner(System.in).nextLine(); //??
		boy = a.charAt(0); //??????
		girl = a.charAt(a.length() - 1); //???????
		f();
		return 0;
	}
}
