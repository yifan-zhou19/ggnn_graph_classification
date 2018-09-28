import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String c = new String(new char[510]);
		int n;
		int len;
		int i;
		int[] cnt = new int[510];
		int[] t = new int[510];
		int s;
		int j;
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 0; i < len - n; i++)
		{
			/*cout<<cnt[2]<<endl;*/
			p = c.Substring(i) + 1;
			for (; p <= c.Substring(len) - n + 1; p++)
			{
				for (s = 0; s <= n - 1; s++)
				{
					if (c.charAt(i + s) != *(p + s))
					{
						break;
					}
				}
				if (s == n)
				{
					cnt[i]++;
				}
			}
		}
		max = 0;
		s = 0;
		/*for (i = 0; i < len; i++)
			cout<<cnt[i]<<" ";
		cout<<endl;*/
		for (j = 0; j < len; j++)
		{
			if (cnt[j] > max)
			{
				s = 0;
				max = cnt[j];
				t[s] = j;
			}
			else
			{
				if (cnt[j] == max)
				{
					s++;
					t[s] = j;
				}
			}
		}
		if (max != 0)
		{
			System.out.print(max + 1);
			System.out.print("\n");
			for (i = 0; i <= s; i++)
			{
				/*cout << i<<endl;
				cout << t[i]<<endl;*/
				for (j = 0; j < n - 1; j++)
				{
					System.out.print(c.charAt(t[i] + j));
				}
				System.out.print(c.charAt(t[i] + j));
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

