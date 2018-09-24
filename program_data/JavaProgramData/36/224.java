package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int[] a1 = new int[100];
		int[] a2 = new int[100];
		int l1;
		int l2;
		int i;
		int j;
		int panding;
		panding = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		l1 = s1.length();
		l2 = s2.length();
		for (i = 0;i <= l1 - 1;i++)
		{
			for (j = 0;j <= l1 - 1;j++)
			{
				if ((s1.charAt(i) == s2.charAt(j)) && (a2[j] == 0))
				{
					a2[j] = 1;
					break;
				}
			}
		}
		for (i = 0;i <= l1 - 1;i++)
		{
			if (a2[i] == 0)
			{
				panding = 0;
			}
		}
		if (l1 != l2)
		{
			panding = 0;
		}
		if (panding == 0)
		{
			System.out.print("NO");
		}
			else
			{
				System.out.print("YES");
			}
	}



}

