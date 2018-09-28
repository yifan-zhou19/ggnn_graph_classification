package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[102];
		  int[] p = new int[102];
		  int t;
		  int i;
		  int j;
		  int s;
		  int q;
		  String str = new String(new char[102]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  t = str.length();
		  for (i = 0;i < t;i++)
		  {
				a[i] = 0;
				p[i] = 0;
		  }
		  for (i = 0;i < t;i++)
		  {
				a[i] = str.charAt(i) - '0';
		  }
		  s = a[0];
		  if (str.charAt(1) != '\0' && !(str.charAt(2) == '\0' && str.charAt(0) == '1' && str.charAt(1) < '3'))
		  {
			   for (j = 0;j < t - 1;j++)
			   {
				s = s * 10 + a[j + 1];
			   q = s % 13;
			   p[j] = (s - q) / 13;
			   s = q;
			   }
		   if (p[0] == 0)
		   {
			   for (j = 1;j < t - 1;j++)
			   {
				 System.out.printf("%d",p[j]);
			   }
		   }
		   else
		   {
			   for (j = 0;j < t - 1;j++)
			   {
				 System.out.printf("%d",p[j]);
			   }
		   }
		   System.out.print("\n");
		   System.out.printf("%d",q);
		  }
		  else
		  {
				System.out.print("0\n");
			System.out.printf("%s",str);
		  }
	}

}

