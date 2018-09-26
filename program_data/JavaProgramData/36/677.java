package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int l1;
		int l2;
		int[] tag1 = new int[100];
		int[] tag2 = new int[100];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				for (j = 0;j < l1;j++)
				{
					if (tag2[j] != 0)
					{
						continue;
					}
					if (a.charAt(i) == b.charAt(j))
					{
						tag1[i] = 1;
						tag2[j] = 1;
						break;
					}
				}
			}
					for (i = 0;i < l1;i++)
					{
						if (tag1[i] == 0)
						{
							m = 1;
							break;
						}
					}
						if (m == 0)
						{
							System.out.print("YES");
						}
						else
						{
							System.out.print("NO");
						}
		}
	}

}

