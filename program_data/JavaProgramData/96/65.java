package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   int[] b = new int[100];
	   int i;
	   int j = 0;
	   int k;
	   int l;
	   int S;
	   int p;
	   int q;
	   String str1 = new String(new char[100]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str1 = tempVar.charAt(0);
	   }
	   l = str1.length();

	   for (i = 0;i <= l - 1;i++)
	   {
			  a[i] = str1.charAt(i) - '0';
	   }
		 p = a[0];
	   if (l >= 2)
	   {
				for (i = 0;i <= l - 2;i++)
				{
			  S = p * 10 + a[i + 1];
			  p = S / 13;
			  q = S % 13;
			  b[j] = S / 13;
			  j++;
			  p = q;
				}
	   if (b[0] == 0 && l > 2)
	   {
		 for (k = 1;k <= j - 1;k++)
		 {
		 System.out.printf("%d",b[k]);
		 }
		 System.out.print("\n");
		 System.out.printf("%d\n",q);
	   }
	   if (b[0] == 0 && l == 2)
	   {
		  System.out.printf("%d\n",b[0]);
		  System.out.printf("%d\n",q);
	   }
	   if (b[0] != 0)
	   {
		 for (k = 0;k <= j - 1;k++)
		 {
		 System.out.printf("%d",b[k]);
		 }
		 System.out.print("\n");
		 System.out.printf("%d\n",q);
	   }
	   }
		  if (l < 2)
		  {
			 System.out.print("0\n");
			 System.out.printf("%d\n",a[0]);
		  }


	}

}

