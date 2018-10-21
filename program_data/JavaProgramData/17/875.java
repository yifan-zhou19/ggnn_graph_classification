package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]); //="12(((3))((7()888_)988((555)))))))";
		int i;
		int l;
		int n;
		int x;
		int j;
		int r;
		int[] le = new int[101];
		int[] ri = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
			for (i = 0;i < 100;i++)
			{
				le[i] = 0;
				ri[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == '(')
				{
					le[i] = 1;
				}
				if (s.charAt(i) == ')')
				{
					ri[i] = 1;
				}
			}
			for (i = l - 1;i >= 0;i--)
			{
				if (le[i] == 1)
				{
					for (j = i;j < l;j++)
					{
						if (ri[j] == 1)
						{
							ri[j] = 0;
							le[i] = 0;
							break;
						}
					}
				}
			}
			System.out.println(s);
			for (i = 0;i < l;i++)
			{
				if (ri[i] == 1)
				{
					System.out.print("?");
				}
				if (le[i] == 1)
				{
					System.out.print("$");
				}
				if (ri[i] == 0 && le[i] == 0)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}

