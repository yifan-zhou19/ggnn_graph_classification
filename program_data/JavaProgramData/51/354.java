package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int len = 0;
		 int n;
		 int i;
		 int j;
		 int k;
		 int m = 0;
		 int h = 0;
		 int r = 0;
		 int d = 0;
		 int q = 0;
		 int[] a = new int[500];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String c = new String(new char[501]);
		 c = new Scanner(System.in).nextLine();
		 c = new Scanner(System.in).nextLine();
		 len = c.length();
		 for (i = 0;i < len - n;i++)
		 {
			 m = 0;
			 for (j = i + 1;j <= len - n;j++)
			 {
				 r = 0;
				 for (k = 0;k < n;k++)
				 {
					 if (c.charAt(i + k) == c.charAt(j + k))
					 {
						 r = r++;
					 }
				 }
				 if (r == n)
				 {
					 m = m++;
				 }
			 }
			 a[i] = m;
		 }
		 /*for(i=0;i<len-n;i++)
		 {
			 printf("%d",a[i]);
		 }*/
		  for (i = 0;i < len - n;i++)
		  {
			 d = 0;
			 for (j = 0;j < len - n;j++)
			 {
				 if (a[i] >= a[j])
				 {
					 d = d++;
				 }
			 }
			 if (d == len - n)
			 {
				  h = a[i] + 1;
				  break;
			 }
		  }
		 if (h <= 1)
		 {
			 System.out.print("NO\n");
		 }
		 else
		 {
			 for (i = 0;i < len - n;i++)
			 {
			 d = 0;
			 for (j = 0;j < len - n;j++)
			 {
				 if (a[i] >= a[j])
				 {
					 d = d++;
				 }
			 }
			 if (d == len - n)
			 {
				  h = a[i] + 1;
				  break;
			 }
			 }
		 System.out.printf("%d\n",h);
		 for (i = 0;i < len - n;i++)
		 {
			 d = 0;
			 for (j = 0;j < len - n;j++)
			 {
				 if (a[i] >= a[j])
				 {
					 d = d++;
				 }
			 }
			 if (d == len - n)
			 {
				 for (k = i;k < i + n;k++)
				 {
					 System.out.printf("%c",c.charAt(k));
				 }

				 System.out.print("\n");
			 }

		 }
		 if (d == len - n)
		 {
				  if (h == 1)
				  {
					 for (q = len - n;q < len;q++)
					 {
					 System.out.printf("%c",c.charAt(q));
					 }
				  }
		 }
		 }
		 return 0;
	}
}

