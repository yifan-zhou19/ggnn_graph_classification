package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[301]);
		char temp;
		int[] a = new int[27];
		int[] b = new int[27];
		int t = 0;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		len = n.length();
		for (i = 0;i <= len;i++)
		{
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				for (j = 1;j <= 26;j++)
				{
					if (n.charAt(i) == j + 64)
					{
						a[j] += 1;
						t = 1;
					}
				}
			}
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				for (j = 1;j <= 26;j++)
				{
					if (n.charAt(i) == j + 96)
					{
						b[j] += 1;
						t = 1;
					}
				}
			}
		}
		if (t == 1)
		{
			for (i = 1;i <= 26;i++)
			{
				if (a[i] != 0)
				{
					temp = i + 64;
					System.out.printf("%c=%d\n",temp,a[i]);
				}
			}
			for (i = 1;i <= 26;i++)
			{
				if (b[i] != 0)
				{
					temp = i + 96;
					System.out.printf("%c=%d\n",temp,b[i]);
				}
			}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

