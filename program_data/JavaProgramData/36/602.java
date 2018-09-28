package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int x;
		int y;
		int[] b = new int[26];
		String moto = new String(new char[1000]);
		String genzai = new String(new char[1000]);
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			moto = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			genzai = tempVar2.charAt(0);
		}
		x = moto.length();
		y = genzai.length();
		if (x != y)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < x;i++)
			{
				a[moto.charAt(i) - 'a']++;
				b[genzai.charAt(i) - 'a']++;
			}
			for (i = 0;i < 25;i++)
			{
				if (a[i] != b[i])
				{
					break;
				}
			}
			if (i == 25)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}


}

