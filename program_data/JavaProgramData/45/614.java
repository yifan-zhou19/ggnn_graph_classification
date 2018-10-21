package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int n;
		int m;
		int x;
		int y;
		int l = 0;
		int q;
		int p;
		int s;
		int w;
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
		m = a.length();
		n = b.length();
		for (i = 0;i < n;i++)
		{
			   if (l >= m)
			   {
				   break;
			   }
			if (a.charAt(l) == b.charAt(i))
			{
				l++;
				if (l == 1)
				{
					x = i;
				}
			}
			else
			{
				l = 0;
			}
		}
		System.out.printf("%d",x);
	}


}

