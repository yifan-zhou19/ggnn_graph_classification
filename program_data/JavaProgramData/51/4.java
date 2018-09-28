//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String s = new String(new char[600]);
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 int m = s.length();
	 char[][] a = new char[m + 1][n];
	 int[] b = new int[m + 1];
	 int i = 0;
	 int j = 0;
	 int k = 0;
	 int max = 0;
	 int l = 0;
	 while (i <= m)
	 {
	  b[i] = 0;
	  i++;
	 }
	 i = 0;
	 if (n == 2)
	 {
	  while (i < m - 1)
	  {
	   if (i == 0)
	   {
		a[i][0] = s.charAt(i),a[i][1] = s.charAt(i + 1),b[0]++,k++;
	   }
	   else
	   {
		while (j < i)
		{
		 if (a[j][0] == s.charAt(i) && a[j][1] == s.charAt(i + 1))
		 {
		  b[j]++,j = i;
		 }
		  j++;
		}
	   }
	   if (j == i && i != 0)
	   {
		a[k][0] = s.charAt(i),a[k][1] = s.charAt(i + 1),b[k]++,k++;
	   }
	   j = 0;
	   i++;
	  }
	  i = 0;
	  while (i < k)
	  {
	   if (b[i] > max)
	   {
		max = b[i];
	   }
	   i++;
	  }
	  i = 0;
	  while (i < k)
	  {
	   if (b[i] == max)
	   {
		l++;
	   }
	   i++;
	  }
	  if (max == 1)
	  {
	   System.out.print("NO");
	  }
	  else
	  {
	   System.out.printf("%d\n",max);
	   i = 0;
	   while (i < k)
	   {
		if (b[i] == max)
		{
		 System.out.printf("%c%c\n",a[i][0],a[i][1]);
		}
		i++;
	   }
	  }
	 }
	 if (n == 3)
	 {
	  while (i < m - 2)
	  {
	   if (i == 0)
	   {
		a[i][0] = s.charAt(i),a[i][1] = s.charAt(i + 1),a[i][2] = s.charAt(i + 2),b[0]++,k++;
	   }
	   else
	   {
		while (j < i)
		{
		 if (a[j][0] == s.charAt(i) && a[j][1] == s.charAt(i + 1) && a[j][2] == s.charAt(i + 2))
		 {
		  b[j]++,j = i;
		 }
		  j++;
		}
	   }
	   if (j == i && i != 0)
	   {
		a[k][0] = s.charAt(i),a[k][1] = s.charAt(i + 1),a[k][2] = s.charAt(i + 2),b[k]++,k++;
	   }
	   j = 0;
	   i++;
	  }
	  i = 0;
	  while (i < k)
	  {
	   if (b[i] > max)
	   {
		max = b[i];
	   }
	   i++;
	  }
	  i = 0;
	  while (i < k)
	  {
	   if (b[i] == max)
	   {
		l++;
	   }
	   i++;
	  }
	  if (max == 1)
	  {
	   System.out.print("NO");
	  }
	  else
	  {
	  System.out.printf("%d\n",max);
	  i = 0;
	  while (i < k)
	  {
	   if (b[i] == max)
	   {
		System.out.printf("%c%c%c\n",a[i][0],a[i][1],a[i][2]);
	   }
	   i++;
	  }
	  }
	 }
	 if (n == 4)
	 {
	  while (i < m - 3)
	  {
	   if (i == 0)
	   {
		a[i][0] = s.charAt(i),a[i][1] = s.charAt(i + 1),a[i][2] = s.charAt(i + 2),a[i][3] = s.charAt(i + 3),b[0]++,k++;
	   }
	   else
	   {
		while (j < i)
		{
		 if (a[j][0] == s.charAt(i) && a[j][1] == s.charAt(i + 1) && a[j][2] == s.charAt(i + 2) && a[j][3] == s.charAt(i + 3))
		 {
		  b[j]++,j = i;
		 }
		  j++;
		}
	   }
	   if (j == i && i != 0)
	   {
		a[k][0] = s.charAt(i),a[k][1] = s.charAt(i + 1),a[k][2] = s.charAt(i + 2),a[k][3] = s.charAt(i + 3),b[k]++,k++;
	   }
	   j = 0;
	   i++;
	  }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


