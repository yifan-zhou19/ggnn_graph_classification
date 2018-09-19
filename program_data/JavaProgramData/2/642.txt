import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] c = new int[26];
		int max1 = 0;
		int temp;
		char[][] m = new char[1000][26];
		char max2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			m[i - 1] = new Scanner(System.in).nextLine();
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 26;j++)
			{
				c[m[i][j] - 'A']++;
			}
		}
		//cout<<c[1]<<endl;
		for (int s = 0;s < 26;s++)
		{
			//cout<<c[s]<<" "<<max1<<endl;
			if (max1 <= c[s])
			{
				max1 = c[s];
				temp = s + 'A';
				max2 = temp;
			}
		}
		System.out.print(max2);
		System.out.print("\n");
		System.out.print(max1);
		System.out.print("\n");
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 26;j++)
			{
				if (m[i][j] == max2)
				{
					System.out.print(a[i]);
					System.out.print("\n");
					break;
				}
			}
		}

		return 0;
	}


}

