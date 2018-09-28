package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int i;
		int j;
		int k;
		int t;
		int max;
		String s = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			for (j = i + 1;j < s.length();j++)
			{
				t = 1;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						t = 0;
					}
				}
				if (t == 1)
				{
					a[i]++;
				}
			}
		}
		t = 0;
		for (i = 0;i < s.length();i++)
		{
			if (a[i] > 0)
			{
				t = 1;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("NO");
		}
		else
		{
			max = 1;
			for (i = 0;i < s.length();i++)
			{
				if (a[i] > max)
				{
					max = a[i];
				}
			}
			System.out.printf("%d\n",max + 1);
			for (i = 0;i < s.length();i++)
			{
				if (a[i] == max)
				{
					for (j = i;j < i + n;j++)
					{
						System.out.printf("%c",s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

