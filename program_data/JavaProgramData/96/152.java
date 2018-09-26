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
	   int length = s.length();
	   int[] t = new int[100];
	   int i;
	   for (i = 0;i < length;i++)
	   {
		  t[i] = s.charAt(i) - '0';
	   }
	   if (length == 1)
	   {
		  System.out.printf("0\n%d",t[0]);
	   }
	   else if ((length == 2) && (t[0] * 10 + t[1] < 13))
	   {
		  System.out.printf("0\n%d",t[0] * 10 + t[1]);
	   }
	   else
	   {
	   int[] p = new int[100];
	   int a = t[0];
	   int k = 1;
	   for (i = 1;i < length;i++)
	   {
		  a = a * 10 + t[i];
		  p[i] = a / 13;
		  a = a % 13;
		  k++;
	   }
	   for (i = 1;i < k;i++)
	   {
		   if ((i == 1) && (p[i] == 0))
		   {
			 continue;
		   }
		   else
		   {
			 System.out.printf("%d",p[i]);
		   }
	   }
	   System.out.print("\n");
	   System.out.printf("%d",a);
	   }
	   System.in.read();
	   System.in.read();
	}
}

