package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int t;
		  int k;
		  int i;
		  int x1;
		  int x2;
		  int[] a = new int[251];
		  t = 0;
		  m = 0;
		  n = 0;
		  String str1 = new String(new char[250]);
		  String str2 = new String(new char[250]);
		  for (i = 0;i < 250;i++)
		  {
		  a[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str1 = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str2 = tempVar2.charAt(0);
		  }
		  x1 = str1.length();
		  x2 = str2.length();
		  if (x1 > x2)
		  {
				   for (i = (x1 - x2 - 1);i >= 0;i--)
				   {
				   a[i] = a[i] + str1.charAt(i) - '0';
				   }
		  for (i = x1 - 1;i >= (x1 - x2);i--)
		  {
					 a[i] = a[i] + str1.charAt(i) + str2.charAt(i + x2 - x1) - '0'-'0';
					 if (a[i] >= 10)
					 {
					 for (k = i;k >= 1;k--)
					 {
						 a[k - 1] = a[k - 1] + 1;
						 a[k] = a[k] % 10;
						 if (a[k - 1] < 10)
						 {
						 break;
						 }
					 }
					 }
		  }
		  for (i = 0;i <= x1 - 1;i++)
		  {
				 if (a[i] != 0 || a[i] == 0 && t != 0)
				 {
				 System.out.printf("%d",a[i]);
				 t = 1;
				 }
				 if (i == 1 && t == 0)
				 {
				 System.out.print("0");
				 }
		  }
		  }
		 else if (x1 < x2)
		 {
							for (i = (x2 - x1 - 1);i >= 0;i--)
							{
			  a[i] = a[i] + str2.charAt(i) - '0';
							}
			  for (i = x2 - 1;i >= (x2 - x1);i--)
			  {
					 a[i] = a[i] + str1.charAt(i + x1 - x2) + str2.charAt(i) - '0'-'0';
					 if (a[i] >= 10)
					 {
					 for (k = i;k >= 1;k--)
					 {
					 a[k - 1] = a[k - 1] + 1;
					 a[k] = a[k] % 10;
					 if (a[k - 1] < 10)
					 {
					 break;
					 }
					 }
					 }
			  }
			  for (i = 0;i < x2;i++)
			  {
							   if (a[i] != 0 || a[i] == 0 && m != 0)
							   {
								System.out.printf("%d",a[i]);
								m = 1;
							   }
								if (i == 1 && m == 0)
								{
								System.out.print("0");
								}
			  }
		 }
		  else
		  {
			  for (i = x1 - 1;i >= 0;i--)
			  {
			  a[x1 - i - 1] = a[x1 - i - 1] + str1.charAt(i) + str2.charAt(i) - '0'-'0';
			  if (a[x1 - 1 - i] >= 10)
			  {
					 a[x1 - i]++;
					 a[x1 - 1 - i] = a[x1 - 1 - i] % 10;
			  }
			  }
			  if (a[x1] != 0)
			  {
			  for (i = x1;i >= 0;i--)
			  {
			  System.out.printf("%d",a[i]);
			  }
			  }
			  else
			  {
			  for (i = x1 - 1;i >= 0;i--)
			  {
					 if (a[i] != 0 || a[i] == 0 && n != 0)
					 {
					 System.out.printf("%d",a[i]);
					 n = 1;
					 }
					 if (i == 0 && n == 0)
					 {
					 System.out.print("0");
					 }
			  }
			  }
		  }

	}


}

