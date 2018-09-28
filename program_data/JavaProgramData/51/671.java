import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[510]);
		char[][] div = new char[510][5];
		String p;
		int[] times = new int[510];
		int n;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j;
		int k;
		int max;
		int cnt;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = new Scanner(System.in).nextLine();
		len = str.length();
		p = str;
		q = times;
		for (i = 0; i < len - n + 1; i++)
		{
			for (cnt = 0, k = i; cnt <= n; k++, cnt++)
			{
				if (cnt == n)
				{
					div[i][k - i] = '\0';
				}
				else
				{
					div[i][k - i] = (p.Substring(k));
				}
			}
		}
		for (i = 0; i < len - n + 1; i++)
		{
			if (*(q + i) < 0)
			{
				continue;
			}
			*(q + i) += 1;
			for (j = i + 1; j < len - n + 1; j++)
			{
				if (strcmp(div[i], div[j]) == 0)
				{
					*(q + i) += 1;
					*(q + j) = -1;
				}
			}
		}
		max = 0;
		for (i = 0; i < len - n + 1; i++)
		{
			max = (max > *(q + i) ? max : *(q + i));
		}
		if (max <= 1)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(max);
			System.out.print("\n");
			for (i = 0; i < len - n + 1; i++)
			{
				if (*(q + i) == max)
				{
					System.out.print(div[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

