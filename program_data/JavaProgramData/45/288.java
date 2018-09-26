package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int n;
		int i;
		int j;
		int a;
		int b;
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
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
			b = i;
			a = 0;
			for (j = 0;j < n;j++)
			{
				if (s1.charAt(j) == s2.charAt(i))
				{
					a++;
				}
				i++;
			}
			if (a == n)
			{
				System.out.printf("%d",b);
				break;
			}
			else
			{
				i = b;
			}
		}
	}
}

