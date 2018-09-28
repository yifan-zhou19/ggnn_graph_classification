package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] c = new int[254];
		int i;
		int l1;
		int l2;
		int m;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		l1 = (int)a.length();
		l2 = (int)b.length();
		while (l1 > 0 || l2 > 0)
		{
			m = (l1 > 0)?a.charAt(--l1) - '0':0;
			n = (l2 > 0)?b.charAt(--l2) - '0':0;
			c[l] += m + n;
			c[l + 1] = c[l] / 10;
			c[l] %= 10;
			l++;
		}
		while (c[l] == 0 && l > 0)
		{
			l--;
		}
		for (i = l;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
	}
}

