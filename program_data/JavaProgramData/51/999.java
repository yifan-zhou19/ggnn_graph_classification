import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[550]);
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		String p = a;
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] c =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int[] num = new int[550];
		for (int i = 0;i <= len - n;i++)
		{
			int j = 0;
			for (;j < n;j++)
			{
				b[i][j] = a.charAt(j + i);
			}
			b[i][j] = '\0';
			//cout<<b[i]<<endl;
		}
		for (int i = 0;i < len - n;i++)
		{
			for (int j = i + 1;j <= len - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		int max = 0;
		for (int i = 0;i < len - n;i++)
		{
			if (max < num[i])
			{
				max = num[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print(max + 1);
			System.out.print("\n");
			for (int i = 0;i < len - n;i++)
			{
				if (num[i] == max)
				{
					System.out.print(b[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

