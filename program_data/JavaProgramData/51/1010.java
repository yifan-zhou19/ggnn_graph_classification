import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String in = new String(new char[510]);
		char[][] a = new char[255][5];
		int n = 0;
		int[] num = new int[255];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		in = new Scanner(System.in).nextLine();
		int len = in.length();
		int k = 0;
		int i = 0;
		int j = 0;
		for (i = 0;i < len;i++)
		{
			num[i] = 1;
		}
		for (i = 0;i <= len - n;i++)
		{
			a[k] = in.substring(i, i + n);
			a[k][n] = '\0';
			k++;
		}

	//for(i=0;i<k;i++)
	//	cout<<a[i]<<endl;

		for (i = 0;i < k - 1;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (strcmp(a[i],a[j]) == 0)
				{
					num[j] = 0;
					if (num[i] != 0)
					{
						num[i]++;
					}
				}
			}
		}


	//for(i=0;i<k;i++)
	//		cout<<num[i]<<endl;

		int max = 0;
		for (i = 0;i < k;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}

		if (max == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i < k;i++)
		{
			if (num[i] == max)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;

	}
}

