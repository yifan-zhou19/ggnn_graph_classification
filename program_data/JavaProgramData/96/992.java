import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***********************************************
	//???:??13                                 *
	//??????                                  *
	//??11?14?                                  *
	//***********************************************
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int r = 0;
		int len;
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 0;i < len;i++)
		{
			//????????????a[i]?r? 
			a[i] = (c.charAt(i) - '0') + r * 10;
			r = a[i] % 13;
			a[i] /= 13;
		}
		//?????????0????i 
		for (i = 0;i < len;i++)
		{
			if (a[i] != 0)
			{
			break;
			}
		}
		//????0.???????0 
		if (i == len)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(r);
		}
		else
		{
			for (;i < len;i++)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}


}
