package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int len;
		int maxlen;
		int minlen;
		String max = new String(new char[20]);
		String min = new String(new char[20]);
		String cen = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cen = tempVar.charAt(0);
		}
		len = cen.length();
		maxlen = minlen = len;
		max = cen;
		min = cen;
		while (System.in.read() != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cen = tempVar2.charAt(0);
			}
			if (cen.length() > maxlen)
			{
			max = cen;
			maxlen = cen.length();
			}
			if (cen.length() < minlen)
			{
			min = cen;
			minlen = cen.length();
			}

		}
		System.out.printf("%s\n",max);
		System.out.printf("%s\n",min);

	}

}

