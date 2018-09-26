package <missing>;

public class GlobalMembers
{
	public static int strchange(String s, int[] n)
	{
		  int i;
		  for (i = 0;i < s.length();i++)
		  {
			  n[i] = s[i] - '0';
		  }
		  return (s.length());
	}
	public static int Main()
	{
		 int[] a = new int[101];
		 int[] b = new int[101];
		 int[] c = new int[101];
		 int i;
		 int j;
		 int n;
		 int yushu;
		 int wei;
		 int x;
		 int y;
		 String s = new String(new char[101]);
		 for (i = 0;i < 101;i++)
		 {
			 a[i] = 0;
			 b[i] = 0;
			 c[i] = 0;
			 s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		 }
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 n = strchange(s, a);
		 if (n == 1)
		 {
			 System.out.printf("%d\n%d",0,a[0]);
		 }
		 else if (n == 2 && a[0] * 10 + a[1] < 13)
		 {
			 System.out.printf("%d\n%d%d",0,a[0],a[1]);
		 }
		 else
		 {
			 x = a[0];
			 y = a[1];
		 for (i = 0;i < n - 1;i++)
		 {
			  b[i] = (a[i] * 10 + a[i + 1]) / 13;
			  yushu = (a[i] * 10 + a[i + 1]) % 13;
			  a[i + 1] = yushu;
		 }
		 if ((x * 10 + y) >= 13)
		 {
			 for (i = 0;i < n - 1;i++)
			 {
				 System.out.printf("%d",b[i]);
			 }
		 }
		 else
		 {
			 for (i = 1;i < n - 1;i++)
			 {
				 System.out.printf("%d",b[i]);
			 }
		 }
		 System.out.printf("\n%d",yushu);
		 }
	}
}

