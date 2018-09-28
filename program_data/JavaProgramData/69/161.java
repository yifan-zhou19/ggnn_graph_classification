package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[255]);
	  String b = new String(new char[255]);
	  String c = new String(new char[255]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
	  int k = 0;
	  int m;
	  int n;
	  int t;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = tempVar2.charAt(0);
	  }
	  m = a.length();
	  n = b.length();
	  if (m > n)
	  {
		for (p = b.Substring(n) - 1;p >= b;p--)
		{
			*(p + m - n) = *p;
		}
		for (p = b.Substring(m) - n - 1;p >= b;p--)
		{
			*p = '0';
		}
	  }
	  else
	  {
		for (p = a.Substring(m) - 1;p >= a;p--)
		{
			*(p + n - m) = *p;
		}
		for (p = a.Substring(n) - m - 1;p >= a;p--)
		{
			*p = '0';
		}
	  }
	  t = m > n != 0?m:n;
	  for (i = t;i > 0;i--)
	  {
		*(c.Substring(i) - 1) = *(b.Substring(i) - 1) + *(a.Substring(i) - 1) - '0' + k;
		if (*(c.Substring(i) - 1) > '9')
		{
			*(c.Substring(i) - 1) -= 10;
			k = 1;
		}
		else
		{
			k = 0;
		}
	  }
	  if (k == 1)
	  {
		for (i = t;i > 0;i--)
		{
			*(c.Substring(i)) = *(c.Substring(i) - 1);
		}
		*(c.Substring(0)) = '1';
		*(c.Substring(t) + 1) = '\0';
	  }
	  else
	  {
		  *(c.Substring(t)) = '\0';
	  }
	  for (p = c; * p == '0';p++)
	  {
	  }
	  System.out.printf("%s",p);
	  if (m == 1 && n == 1 && b.charAt(0) == '0' && a.charAt(0) == '0')
	  {
		  System.out.print("0");
	  }
	  System.out.print("\n");
	}
}

