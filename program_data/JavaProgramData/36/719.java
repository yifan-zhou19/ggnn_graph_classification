package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n1;
		int n2;
		int[] b = new int[100];
		int i;
		int j;
		int p = 0;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
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
		n1 = s1.length();
		n2 = s2.length();
		for (i = 0;i < n1;i++)
		{
			b[i] = 1;
		}
		if (n1 != n2)
		{
			System.out.print("NO");
		}
		else
		{
			i = 0;
			while (i < n1)
			{
				for (j = 0;j < n1;j++)
				{
					   if (s1.charAt(i) == s2.charAt(j) && b[j] == 1)
					   {
						   break;
					   }
				}
				if (j < n1)
				{
					p++;
				   b[j] = 0;
				}
				else
				{
					i = n1;
				}
				i++;
			}
			if (p == n1)
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

