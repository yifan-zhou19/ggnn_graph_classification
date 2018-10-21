package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		String a = new String(new char[501]);
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		};
		int[] times = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (i = 0;i <= len - n;i++) //?????n-gram
		{
			for (j = 0;j < n;j++)
			{
				s[i][j] = a.charAt(i + j);
			}
			s[i][n] = '\0';
			times[i]++;
		}
		//for(i=0;i<=len-n;i++) cout<<s[i]<<endl;
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j < i;j++) //??????
			{
				if (strcmp(s[i],s[j]) == 0)
				{
					times[j]++;
					times[i] = 0;
					break;
				}
			}
		}
		//for(i=0;i<=len-n;i++) cout<<times[i]<<endl;
		int max = 1;
		for (i = 0;i <= len - n;i++)
		{
			if (times[i] > max)
			{
				max = times[i];
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
		for (i = 0;i <= len - n;i++)
		{
			if (times[i] == max)
			{
				System.out.print(s[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

