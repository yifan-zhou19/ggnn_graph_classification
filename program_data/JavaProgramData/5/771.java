package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double c;
		String s = new String(new char[1000]);
		String as = new String(new char[1000]);
		int m;
		int n;
		int t;
		int i;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			as = tempVar3.charAt(0);
		}
		t = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != 65 && s.charAt(i) != 67 && s.charAt(i) != 71 && s.charAt(i) != 84)
			{
				t = -1;
				break;
			}
		}
		for (i = 0;as.charAt(i) != '\0';i++)
		{
			if (as.charAt(i) != 65 && as.charAt(i) != 67 && as.charAt(i) != 71 && as.charAt(i) != 84)
			{
				t = -1;
				break;
			}
		}
		m = s.length();
		n = as.length();
		if (m != n)
		{
			t = -1;
		}
		b = 0;
		if (t == 0)
		{
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == as.charAt(i))
				{
					b++;
				}
			}
			c = 1.0 * b / m;
			if (c > a)
			{
			   t = 1;
			}
			else
			{
			t = 0;
			}
		}
		if (t == -1)
		{
			System.out.print("error\n");
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
		if (t == 1)
		{
			System.out.print("yes\n");
		}
		return 0;
	}

}

