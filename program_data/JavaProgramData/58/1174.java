package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
		s = new Scanner(System.in).nextLine();
		int m;
		int j = 0;
		int count = 0;
		while (s.charAt(j) != '\0')
		{
			if (s.charAt(j) == ' ' || s.charAt(j) < 'A' && s.charAt(j)>'9' || s.charAt(j) > 'Z' && s.charAt(j) < 'A' || s.charAt(j)>'z' || s.charAt(j) < '0')
			{
			count++;
			}
			j++;
		}
		if (s.charAt(0) == '_' || s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
		{
			if (count == 0)
			{
			 m = 1;
			}
			else
			{
			m = 0;
			}
		}
		 else
		 {
		m = 0;
		 }
		System.out.printf("%d\n",m);
		}
	}
}

