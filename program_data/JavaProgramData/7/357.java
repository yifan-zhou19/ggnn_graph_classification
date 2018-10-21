package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int le;
	  int len;
	  int lenn;
	  int i;
	  int j;
	  int k;
	  int a = 0;
	  int b;
	  int m = 0;
	  String aa = new String(new char[256]);
	  String bb = new String(new char[256]);
	  String cc = new String(new char[256]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  aa = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  bb = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  cc = tempVar3.charAt(0);
	  }
	  le = aa.length();
	  len = bb.length();
	  lenn = cc.length();
	  for (i = 0;i < le;i++)
	  {
		  a = 0;
		   for (j = i, k = 0;j < len + i && k < len;j++, k++)
		   {
		   if (bb.charAt(k) == aa.charAt(j))
		   {
				 a++;
		   }
		   }
		   if (a == len)
		   {
			   b = i;
			   m++;
			   break;
		   }
	  }

		 if (m == 0)
		 {
			 System.out.println(aa);
		 }
		 else
		 {
		  for (i = 0;i < b;i++)
		  {
			  System.out.printf("%c",aa.charAt(i));
		  }
		  for (k = 0;k < lenn;k++)
		  {
			  System.out.printf("%c",cc.charAt(k));
		  }
		  for (i = b + len;i < le;i++)
		  {
			  System.out.printf("%c",aa.charAt(i));
		  }
		 }
	return 0;
	}
}

