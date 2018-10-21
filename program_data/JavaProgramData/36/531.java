package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l1;
		int l2;
		int[] a = new int[60];
		int[] b = new int[60];
		String m = new String(new char[100]);
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		l1 = m.length();
		l2 = n.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
	   for (i = 0;i < l1;i++)
	   {
			if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
			{
				a[m.charAt(i) - 'A' + 26]++;
			}
			else
			{
				a[m.charAt(i) - 'a']++;
			}
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				b[n.charAt(i) - 'A' + 26]++;
			}
			else
			{
				b[n.charAt(i) - 'a']++;
			}



	   }
		for (i = 0;i < 52;i++)
		{
			if (b[i] != a[i])
			{
				break;
			}
		}
		if (i == 52)
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

