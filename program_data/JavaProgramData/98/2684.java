package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int s;
		int t;
		String word = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		System.out.printf("%s",word);
		l = word.length();
		s = l;
		t = 0;
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				word = tempVar3.charAt(0);
			}
			l = word.length();
			s += l;
			t++;
			if (s + t <= 80)
			{
				System.out.printf(" %s",word);
			}
			else
			{
				System.out.print("\n");
				System.out.printf("%s",word);
				s = l;
				t = 0;
			}
		}
	}



}

