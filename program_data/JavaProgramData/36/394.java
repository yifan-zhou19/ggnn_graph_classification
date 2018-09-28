package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void pai(char s[],int n);
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 int c;
	 int d;
	 int e = 0;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 c = a.length();
	 d = b.length();
	 if (c != d)
	 {
	   System.out.print("NO");
	 }
	 else
	 {
		   pai(a, c);
		   pai(b, c);
		   for (i = 0;i <= c - 1;i++)
		   {
				 if (a.charAt(i) != b.charAt(i))
				 {
					  e = 1;
				   break;
				 }
		   }
		   if (e == 1)
		   {
			 System.out.print("NO");
		   }
		   else
		   {
			 System.out.print("YES");
		   }
	 }

	}

	public static void pai(String s, int n)
	{
		int i;
		int j;
		int k;
	 char t;
	 for (i = 0;i < n - 1;i++)
	 {
			k = i;
		 for (j = i + 1;j < n;j++)
		 {
			if (s[j].compareTo(s[k]) < 0)
			{
			  k = j;
			}
		 }
		 t = s[k],s[k] = s[i],s[i] = t;
	 }
	}
}

