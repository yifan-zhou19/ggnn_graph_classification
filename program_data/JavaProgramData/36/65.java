package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int k;
		int l;
		int s;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		j = a.length();
		k = b.length();
		if (j != k)
		{
			System.out.print("NO");
		}
		else
		{
			m = 0;
			for (l = 0;l < j;l++)
			{
				s = 0;
				p = 0;
				for (i = 0;i < j;i++)

				{
				if (a.charAt(l) == a.charAt(i))
				{
			s++;
				}
			if (a.charAt(l) == b.charAt(i))
			{
				p++;
			}
				}
				if (s == p)
				{
					m++;
				}
			}




			if (m == j)
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

