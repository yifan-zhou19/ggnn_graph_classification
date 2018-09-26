package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[1000]);
		String s2 = new String(new char[1000]);
		char n;
		char n1;
		char i;
		char j;
		char k;
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
		n = s1.length();
		n1 = s2.length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n1;j++)
			{
				if (s2.charAt(j) == s1.charAt(i))
				{
				s2 = s2.substring(0, j);
				s1 = s1.substring(0, i);
				}
			}
		}
		for (j = 0,k = 0;j < n1;j++)
		{
			if (s2.charAt(j) != 0)
			{
				k++;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (s1.charAt(j) != 0)
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}


}

