package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
		String s = new String(new char[101]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int[] left = new int[101];
		int[] right = new int[101];
		int i;
		int l = 0;
		int r = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == '(')
			{
				left[l++] = i + 1;
			}
			else
			{
				if (s.charAt(i) == ')')
				{
					if (l != 0)
					{
						l--;
						left[l] = 0;
					}
					else
					{
						right[r++] = i + 1;
					}
				}
			}
		}
		int le = 0;
		int ri = 0;
		System.out.printf("%s\n",s);
		for (i = 0;i < s.length();i++)
		{
			if (left[le] == i + 1)
			{
				System.out.print("$");
				le++;
			}
			else
			{
				if (right[ri] == i + 1)
				{
					System.out.print("?");
					ri++;
				}
				else
				{
					System.out.print(" ");
				}
			}
		}
		System.out.print("\n");
		}
		return 0;
	}
}

