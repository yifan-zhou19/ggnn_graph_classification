package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int k;
		int l;
		int n;
		int[] m = new int[100];
		int o;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		p = a.length();
		o = 0;
		for (i = 0;i < p;i++)
		{
		if (((a.charAt(i) <= 57 && a.charAt(i) >= 48) || (a.charAt(i) <= 90 && a.charAt(i) >= 65) || (a.charAt(i) <= 122 && a.charAt(i) >= 97) || (a.charAt(i) == 95)) && (a.charAt(0) > 57 || a.charAt(0) < 48))
		{
			;
		}
		else
		{
		o = 1;
		}
		}

		m[j] = o;
		}

		for (j = 0;j < n;j++)
		{
		if (m[j] == 1)
		{
		System.out.print("no\n");
		}
		else
		{
		System.out.print("yes\n");
		}
		}
		return 0;
	}
}

