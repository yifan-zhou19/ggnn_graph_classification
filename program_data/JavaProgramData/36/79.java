package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int t = 0;
		int[] a1 = new int[26];
		int[] a2 = new int[26];
		int[] a3 = new int[26];
		int[] a4 = new int[26];
		int flag = 0;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String p1;
		String p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		p1 = s1;
		p2 = s2;
		for (i = 0;i < 26;i++)
		{
			a1[i] = 0;
		a2[i] = 0;
		a3[i] = 0;
		a4[i] = 0;
		}
		n1 = s1.length();
		n2 = s2.length();
		if (n1 != n2)
		{
			System.out.print("NO\n");
		}
		if (n1 == n2)
		{
			for (i = 0;i < n1;i++)
			{
				if (*(p1.Substring(i)) >= 'a' && *(p1.Substring(i)) <= 'z')
				{
					t = (p1.Substring(i)) - 97;
				  a1[t]++;
				}
				if (*(p2.Substring(i)) >= 'a' && *(p2.Substring(i)) <= 'z')
				{
					t = (p2.Substring(i)) - 97;
				  a2[t]++;
				}
			   if (*(p1.Substring(i)) >= 'A' && *(p1.Substring(i)) <= 'Z')
			   {
					t = (p1.Substring(i)) - 65;
				  a3[t]++;
			   }
				if (*(p2.Substring(i)) >= 'A' && *(p2.Substring(i)) <= 'Z')
				{
					t = (p2.Substring(i)) - 65;
				  a4[t]++;
				}
			}
			for (i = 0;i < 26;i++)
			{
				if ((a1[i] != a2[i]) || (a3[i] != a4[i]))
				{
					System.out.print("NO\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
			System.out.print("YES\n");
			}
		}
		return 0;
	}

}

