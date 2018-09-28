package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[1000]);
	 int m;
	 int i;
	 int j;
	 int l;
	 int[] a = new int[1000];
	 int k;
	 int[] b = new int[1000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s = tempVar.charAt(0);
	 }
	 l = s.length();
	 if (l == 1)
	 {
	  System.out.print("0\n");
	  System.out.printf("%d\n",s.charAt(0) - '0');
	 }
	 else if (l == 2)
	 {
	  if ((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0') < 13)
	  {
	   System.out.print("0\n");
	   System.out.printf("%d\n",(s.charAt(0) - '0') * 10 + (s.charAt(1) - '0'));
	  }
	  else
	  {
	   System.out.printf("%d\n",((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0')) / 13);
	   System.out.printf("%d\n",((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0')) % 13);
	  }
	 }
	 else
	 {
	  for (i = 0;i < l;i++)
	  {
	   b[i] = s.charAt(i) - '0';
	  }
	  for (i = 0;i < l;i++)
	  {
	   m = b[i] * 10 + b[i + 1];
	   if (m >= 13)
	   {
		a[i] = m / 13;
		b[i + 1] = m % 13;
	   }
	   else
	   {
		a[i] = 0;
		m = m * 10 + b[i + 2];
		i++;
		a[i] = m / 13;
		b[i + 1] = m % 13;
	   }
	  }
	  k = b[i - 1];
	  if (a[0] == 0)
	  {
	   for (i = 1;i < l - 1;i++)
	   {
	   System.out.printf("%d",a[i]);
	   }
	   System.out.printf("\n%d",k);
	  }
	  else
	  {
	   for (i = 0;i < l - 1;i++)
	   {
	   System.out.printf("%d",a[i]);
	   }
	   System.out.printf("\n%d",k);
	  }
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

