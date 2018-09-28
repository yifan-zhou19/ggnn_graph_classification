import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (k = 0;k < n;k++)
		{
			String s1 = new String(new char[10000]);
			String s2 = new String(new char[10000]);
			int[] a1 = new int[10000];
			int[] a2 = new int[10000];
			int l1;
			int l2;
			int[] d = new int[10000];
			s1 = new Scanner(System.in).nextLine();
			s2 = new Scanner(System.in).nextLine();
			l1 = s1.length();
			l2 = s2.length();
			int i;
			int j = 0;
			for (i = l1 - 1;i >= 0;i--)
			{
				a1[j] = s1.charAt(i) - '0';
				j++;
			}
			j = 0;
			for (i = l2 - 1;i >= 0;i--)
			{
				a2[j] = s2.charAt(i) - '0';
				j++;
			}
			/*for (i=0;i<l1;i++)
			cout<<a1[i];
			cout<<endl;
			for (i=0;i<l2;i++)
			cout<<a2[i];
			cout<<endl;*/
			for (i = 0;i < l1;i++)
			{
				//cout<<d[i]<<' ';
				d[i] += a1[i] - a2[i];
				if (d[i] < 0)
				{
					d[i] += 10;
					d[i + 1] -= 1;
				}
			}
			//cout<<endl;
			/*for (i=0;i<l1;i++)
			cout<<d[i];
			cout<<endl;*/
			int q = 0;
			for (i = l1 - 1;i >= 0;i--)
			{
				if ((d[i] == 0) && (q == 0))
				{
					continue;
				}
				System.out.print(d[i]);
				q = 1;
			}
			System.out.print("\n");
			if (k == n - 1)
			{
				return 0;
			}
			System.in.read();
		}
		return 0;
	}
}

