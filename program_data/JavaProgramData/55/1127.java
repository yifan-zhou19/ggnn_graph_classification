package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int num;
	 int sum = 0;
	 int x;
	 int k;
	 int o;
	 int t;
	 int a;
	 int b;
	 String p;
	  sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc((Character.SIZE / Byte.SIZE) * 20);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  p = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	   for (j = 0;j < p.length();j++)
	   {
	   if (*(p.Substring(j)) <= 'z' && *(p.Substring(j)) >= 'a')
	   {
	   *(p.Substring(j)) -= 32;
	   }
	   }

	  for (j = 0;j < p.length();j++)
	  {
	   if (*(p.Substring(j)) <= '9' && *(p.Substring(j)) >= '0')
	   {
			num = (int) * (p.Substring(j)) - 48;
		 t = p.length() - j;
		 while (t > 1)
		 {
			 num *= a,t--;
		 }
	   }
	   else
	   {
			num = (int) * (p.Substring(j)) - 65 + 10;
		 t = p.length() - j;
		 while (t > 1)
		 {
			 num *= a,t--;
		 }
	   }
	   sum += num;
	  }



	  x = sum;
	  k = 0;
	  while (x / b != 0)
	  {
		  k++,x = x / b;
	  }
	  String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  q = (String)malloc((Character.SIZE / Byte.SIZE) * k);
	  x = sum;
	  *(q.Substring(k) + 1) = '\0';
	  while (k >= 0)
	  {
		  o = x % b;
	   if (o <= 9 && o >= 0)
	   {
		   *(q.Substring(k)) = (char)(o + 48);
		x = x / b;
		k--;
	   }
	   else
	   {
		   *(q.Substring(k)) = (char)(o + 55);
		x = x / b;
		k--;
	   }
	  }
	  System.out.printf("%s\n",q);
	}




}

