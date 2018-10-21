import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????
	public static int Main()
	{
		String a = new String(new char[31]);
		int i;
		int n;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		String[] p = new String[30];
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) < '0' || a.charAt(i)>'9') //??????????
			{
				a = a.substring(0, i); //??????
				if (i < n - 1 && a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9') //??????????????
				{
					p[j] = a.Substring(i) + 1; //??????????
					j++;
				}
			}
		}
		if (a.charAt(0) != null) //???????????0??????????
		{
			System.out.print(a);
			System.out.print("\n");
		}
		for (i = 0;i < j;i++) //???0??????????????
		{
			//if (a[i]>='0' && a[i]<='9' && (!i || a[i-1]==0))
			System.out.print(p[i]);
			System.out.print("\n");
		}
		return 0;
	}

}
