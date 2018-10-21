package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int[] b = new int[50];
	int m;
	int t;
	int p;
	int q;
	char[][] s = new char[50][30];
	char c = 0;
	for (n = 0;c != '\n';n++)
	{
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s[n] = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 c = tempVar2.charAt(0);
	 }
	}
	for (i = 0;i < n;i++)
	{
	 b[i] = String.valueOf(s[i]).length();
	}
	m = t = b[0];
	p = q = 0;
	for (i = 1;i < n;i++)
	{
	 if (b[i] > m)
	 {
	   m = b[i];
	   p = i;
	 }
	 if (b[i] < t)
	 {
	   t = b[i];
	   q = i;
	 }
	}
	System.out.printf("%s\n%s\n",s[p],s[q]);
	}


}

