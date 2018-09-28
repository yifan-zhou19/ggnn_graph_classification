package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int check(String s, int i, int j)
	{
		int k;
		int p = 1;
		for (k = 0;k < n;k = k + 1)
		{
			if (!s[i + k].equals(s[j + k]))
			{
				p = 0;
				break;
			}
		}
		return p;
	}
	public static int Main()
	{
		int l;
		int p;
		int[] a = new int[501];
		int i;
		int j;
		int max = 0;
		String s = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = l - n - 1;i >= 0;i = i - 1)
		{
			for (j = i + 1;j <= l - n;j = j + 1)
			{
				p = check(s, i, j);
				if (p != 0)
				{
					a[i] = a[j] + 1;
					if (a[i] > max)
					{
						max = a[i];
					}
					break;
				}
			}
		}
	 if (max == 0)
	 {
		 System.out.print("NO");
	 }
	 else
	 {
		 p = 0;
		 System.out.printf("%d\n",max + 1);
		 for (i = 0;i < l - n;i = i + 1)
		 {
			 if (a[i] == max)
			 {
				 if (p != 0)
				 {
					 System.out.print("\n");
				 }
				 p++;
				 for (j = 0;j < n;j = j + 1)
				 {
					 System.out.printf("%c",s.charAt(j + i));
				 }
			 }
		 }
	 }
	 return 0;
	}

}

