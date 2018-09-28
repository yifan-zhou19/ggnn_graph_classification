package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int len;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		k = 0;
		int ans;
		len = s.length();
		while (true)
		{
			ans = 1;
			for (i = 0;i < len;i++)
			{
				if (s.charAt(i) != w.charAt(i + k))
				{
					ans = 0;
				}
			}
			if (ans == 1)
			{
				break;
			}
			k++;
		}
		System.out.printf("%d",k);


		return 0;


	}
}

