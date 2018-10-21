package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String num = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num = tempVar.charAt(0);
	 }
	 int[] con = new int[100];
	 int[] p = new int[100];
	 int i;
	 int j;
	 int a;
	 int b;
	 int s;
	 int k = 0;
	 int l;
	 for (i = 0;num.charAt(i) != '\0';i++)
	 {
	  con[i] = num.charAt(i) - '0';
	 }
	 if (i == 1)
	 {
	 a = 0;
	 b = con[0];
	 System.out.printf("%d",a);
	 System.out.print("\n");
	 System.out.printf("%d",b);
	 }
	 else
	 {
	  for (j = 0;j <= i - 2;j++)
	  {
	  s = con[j] * 10 + con[j + 1];
	  if (s >= 13)
	  {
	  a = s / 13;
	  b = s % 13;
	  con[j + 1] = b;
	  p[k] = a;
	  k = k + 1;
	  }
	  else
	  {
	   con[j + 1] = s;
	   b = s;
	   if (k == 0)
	   {
	   continue;
	   }
	   else
	   {
		p[k] = 0;
		k = k + 1;
		continue;
	   }
	  }
	  }
	  if (k == 0)
	  {
	  System.out.printf("%d",k);
	  }
	  else
	  {
		  for (l = 0;l <= k - 1;l++)
		  {
		  System.out.printf("%d",p[l]);
		  }
	  }
	  System.out.print("\n");
	  System.out.printf("%d",b);
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	}

}

