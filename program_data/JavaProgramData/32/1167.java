package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (m = 0; m < n; m++)
	 {
	  char[] a = {0};
	  char[] b = {0};
	  char carry = 0;
	  String a_str = new String(new char[SIZE+1]);
	  String b_str = new String(new char[SIZE+1]);
	  char[] ab_minus = {0};
	  int big = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a_str = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b_str = tempVar3.charAt(0);
	  }
	  for (i = a_str.length(), j = SIZE ; i >= 0 ; i--, j--)
	  {
	   a[j] = a_str.charAt(i) - '0';
	  }
	  for (i = b_str.length(), j = SIZE ; i >= 0 ; i--, j--)
	  {
	   b[j] = b_str.charAt(i) - '0';
	  }
	  for (i = SIZE-1; i >= 0; i--)
	  {
	   if (a[i] - carry < b[i])
	   {
		a[i] += 10;
		ab_minus[i] = a[i] - b[i] - carry;
		carry = 1;
	   }
	   else
	   {
		ab_minus[i] = a[i] - b[i] - carry;
		carry = 0;
	   }
	  }
	  for (i = 0; i < SIZE-1 && ab_minus[i] == 0; i++)
	  {
		  ;
	  }
	  for (; i < SIZE; i++)
	  {
	   System.out.printf("%c", ab_minus[i] + '0');
	  }
	  System.out.print("\n");
	 }
	  return 0;
	}
}

