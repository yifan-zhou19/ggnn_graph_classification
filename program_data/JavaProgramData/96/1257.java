package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int c;
		c = s.length();
		for (i = 0;i < c;i++)
		{
			a[i] = s.charAt(i) - '0';
			b[i] = 0;
		}
		for (i = 0;i < c - 1;i++)
		{
			b[i] = (a[i] * 10 + a[i + 1]) / 13;
		 a[i + 1] = (a[i] * 10 + a[i + 1]) % 13;
		}
		 if (b[0] != 0)
		 {
		 for (i = 0;i < c - 1;i++)
		 {
		 System.out.printf("%d",b[i]);
		 }
		 }
		 else
		 {
		 if (b[0] == 0 && b[1] == 0)
		 {
		 System.out.print("0");
		 }
		 else
		 {
		 for (i = 1;i < c - 1;i++)
		 {
		 System.out.printf("%d",b[i]);
		 }
		 }
		 }
		 System.out.printf("\n%d",a[c - 1]);
		 return 0;
	}


}

