package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int[] a = new int[105];
	public static int[] b = new int[105];
	public static int[] c = new int[105];
	public static int l1;
	public static int l2;
	public static int ml;
	public static String s1 = new String(new char[105]);
	public static String s2 = new String(new char[105]);

	public static void jian()
	{
		 for (i = 0;i < ml + 3;i++)
		 {
		 a[i] = b[i] = c[i] = 0;
		 }
		 for (i = 0;i < l1;i++)
		 {
			 a[i] = s1.charAt(l1 - i - 1) - '0';
		 }
		 for (i = 0;i < l2;i++)
		 {
			 b[i] = s2.charAt(l2 - i - 1) - '0';
		 }
		 for (i = 0;i < ml;i++)
		 {
			 c[i] = a[i] - b[i];
			 if (c[i] < 0)
			 {
				c[i] += 10;
				a[i + 1] -= 1;
			 }
		 }
		 while (c[ml] == 0 && ml > 0)
		 {
		 ml--;
		 }
		 for (i = ml;i >= 0;i--)
		 {
		 System.out.printf("%d",c[i]);
		 }
		 System.out.print("\n");
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s1 = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 s2 = tempVar3.charAt(0);
			 }
			 l1 = s1.length();
			 l2 = s2.length();
			 ml = l1;
			 jian();
		}
		return 0;
	}

}

