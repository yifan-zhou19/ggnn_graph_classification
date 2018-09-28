package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30];
		int[] b = new int[30];
		String s = new String(new char[1000000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int i = 0;i < 26;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			for (int i = 0;s.charAt(i);i++)
			{
				int num = s.charAt(i) - 'a';
				if (a[num] == 0)
				{
					b[num] = i + 1;
				}
				a[num]++;
			}
			int ans = -1;
			int ansn = 10000000;
			for (int i = 0;i < 26;i++)
			{
				if (a[i] == 1 && b[i] < ansn)
				{
					ans = i;
					ansn = b[i];
				}
			}
			if (a[ans] != 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print((char)(ans + 'a'));
				System.out.print("\n");
			}
		}
		//cin>>n;
		return 0;
	}



}

