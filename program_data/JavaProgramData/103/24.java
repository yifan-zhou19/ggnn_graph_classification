package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int l = s.length();
		int a = s.charAt(0);
		int n = 1;
		for (int i = 1;i < l;i++)
		{
				if (s.charAt(i) == a || s.charAt(i) == a + 32 || s.charAt(i) == a - 32)
				{
				n++;
				}
				else
				{
					if (a > 'Z')
					{
					a = a - 'a'+'A';
					}
					System.out.printf("(%c,%d)",a,n);
					a = s.charAt(i);
					n = 1;
				}
		}
		if (a > 'Z')
		{
		a = a - 'a'+'A';
		}
		System.out.printf("(%c,%d)",a,n);
		System.in.read();
		System.in.read();
	}

}

