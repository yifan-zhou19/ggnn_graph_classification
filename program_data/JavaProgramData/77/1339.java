import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int paidui(int i, String a, int l) //????,i??????,l???????
	{
		int j;
		if (a[i].equals(a[0]) && i < l) //??a[i]????????
		{
			j = paidui(i + 1, a, l); //????paidui(i+1,a,l)
			System.out.print(i);
			System.out.print(" ");
			System.out.print(j);
			System.out.print("\n");
			return paidui(j + 1, a, l); //??paidui(j+1,a,l)
		}
		else if (!a[i].equals(a[0]) && i < l) //??a[i]?????????
		{
				return i; //??i
		}
	}
	public static int Main()
	{
		int l;
		String a = new String(new char[110]);
		a = new Scanner(System.in).nextLine(); //??????
		l = a.length();
		paidui(0, a, l);
		return 0;
	}
}
