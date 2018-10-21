package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int l;
	public static int[] a = new int[26];
	public static int[] b = new int[26];
	public static int Main()
	{
	 String z = new String(new char[301]);
	 char c;
	 for (i = 0;i < 26;i++)
	 {
	  a[i] = 0;
	  b[i] = 0;
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 z = tempVar.charAt(0);
	 }
	 l = (int)z.length();
	 for (i = 0;i < l;i++)
	 {
	  c = z.charAt(i) - 'A';
	  if (c >= 0 && c <= 25)
	  {
	   a[c]++;
	  }
	 }
		for (i = 0;i < l;i++)
		{
	  c = z.charAt(i) - 'a';
	  if (c >= 0 && c <= 25)
	  {
	   b[c]++;
	  }
		}
	 char m;


	 for (i = 0;i < 26;i++)
	 {
	  if (a[i] != 0)
	  {
	   m = 'A' + i;
	   System.out.printf("%c=%d\n",m,a[i]);
	  }
	 }
	for (i = 0;i < 26;i++)
	{
	  if (b[i] != 0)
	  {
		  m = 'a' + i;
	   System.out.printf("%c=%d\n",m,b[i]);
	  }
	}
	int sum = 0;
	for (i = 0;i < 26;i++)
	{
	sum = sum + a[i] + b[i];
	}
	if (sum == 0)
	{
	System.out.print("No");
	}
	return 0;
	}




}

