import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] s = new int[300];
		for (int i = 0;i < 300;i++)
		{
			s[i] = 0;
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int la = a.length();
		int lb = b.length();
		int k;
		int i;
		int j;
		if (la >= lb)
		{
			for (k = 0,i = la - 1,j = lb - 1;j >= 0;i--,j--,k++)
			{
				s[k] = a.charAt(i) - '0' + b.charAt(j) - '0';
			}
			for (;i >= 0;i--,k++)
			{
				s[k] = a.charAt(i) - '0';
			}
		}
		else
		{
			for (k = 0,i = la - 1,j = lb - 1;i >= 0;i--,j--,k++)
			{
				s[k] = a.charAt(i) - '0' + b.charAt(j) - '0';
				//cout<<k<<s[k]<<' '<<a[i]<<b[j]<<endl;
			}
			for (;j >= 0;j--,k++)
			{
				s[k] = b.charAt(j) - '0';
				//cout<<k<<s[k]<<' '<<a[i]<<b[j]<<endl;
			}
		}
		for (int i = 0;i < k;i++)
		{
			if (s[i] >= 10)
			{
				s[i] -= 10;
				s[i + 1]++;
			}
		}
		while (s[k] == 0)
		{
			k--;
			if (k == -1)
			{
				System.out.print('0');
				System.out.print("\n");
				return 0;
			}
		}
			for (int i = k;i >= 0;i--)
			{
				System.out.print(s[i]);
			}
			System.out.print("\n");
		return 0;
	}


}
