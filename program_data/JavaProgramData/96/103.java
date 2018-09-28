package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int l;
		int d;
		int x;
		int m;
		int[] r = new int[100];
		int[] p = new int[100];
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
		  s[i] = a.charAt(i) - '0';
		}
		r[0] = s[0] % 13;
		p[0] = s[0] / 13;
		for (i = 1;i < l;i++)
		{
		 r[i] = (s[i] + r[i - 1] * 10) % 13;
		 p[i] = (s[i] + r[i - 1] * 10) / 13;
		}
		if (l > 2)
		{
		for (i = 0;i < 3;i++)
		{
		 if (p[i] == 0 && p[i + 1] != 0)
		 {
		 d = i;
		 }
		}
		 for (i = (d + 1);i < l;i++)
		 {
		 System.out.printf("%d",p[i]);
		 }
		}
		 if (l <= 2)
		 {
		 x = s[0];
		 for (i = 1;i < l;i++)
		 {
		  x = s[i] + x * 10;
		 }
		 m = x / 13;
		 System.out.printf("%d",m);
		 }
		System.out.print("\n");
		System.out.printf("%d",r[l - 1]);
		System.in.read();
		System.in.read();
	}


}

