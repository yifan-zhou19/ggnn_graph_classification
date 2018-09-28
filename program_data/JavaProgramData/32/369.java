package <missing>;

public class GlobalMembers
{
	public static void jf(tangible.RefObject<String> a, int n, tangible.RefObject<String> b, int m)
	{
		int i;
		int j;
		int k;
		for (i = m - 1,j = n - 1;i >= 1;i--,j--)
		{
			if (a.argValue.charAt(j) >= b.argValue.charAt(i))
			{
			a.argValue.charAt(j) = a.argValue.charAt(j) - b.argValue.charAt(i) + '0';
			}
			else
			{
			   a.argValue.charAt(j) = a.argValue.charAt(j) - b.argValue.charAt(i) + 10 + '0';
			   a.argValue.charAt(j - 1)--;
			}
		}
		if (n == m)
		{
			a.argValue.charAt(0) = a.argValue.charAt(0) - b.argValue.charAt(0) + '0';
		  for (i = 0;i < n;i++)
		  {
		 System.out.printf("%c",a.argValue.charAt(i));
		  }
		}
		else
		{
		   if (a.argValue.charAt(n - m) >= b.argValue.charAt(0))
		   {
		   a.argValue.charAt(n - m) = a.argValue.charAt(n - m) - b.argValue.charAt(0) + '0';
		   }
		   else
		   {
			 a.argValue.charAt(n - m) = a.argValue.charAt(n - m) - b.argValue.charAt(0) + 10 + '0';
			 a.argValue.charAt(n - m - 1)--;
			  for (k = n - m - 1;k >= 0;k--)
			  {
				if (a.argValue.charAt(k) >= '0')
				{
				 break;
				}
				 else
				 {
				 a.argValue.charAt(k) = 9 + '0';
				  a.argValue.charAt(k - 1)--;
				 }
			  }
		   }
			 for (i = 0;i < n;i++)
			 {
			  System.out.printf("%c",a.argValue.charAt(i));
			 }
		}
	}
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String[] pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  pp = (String)malloc(n * sizeof(String));
	  for (i = 0;i < n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  pp[i] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
	  }
	   String[] qq;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	  qq = (String)malloc(n * sizeof(String));
	  for (i = 0;i < n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  qq[i] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
	  }
	   for (i = 0;i < n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   pp[i] = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   qq[i] = tempVar3.charAt(0);
		   }
		System.out.print("\n");
	   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   pp[n - 1] = tempVar4.charAt(0);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   qq[n - 1] = tempVar5.charAt(0);
		   }
	   int[] p;
	   int[] q;
		p = new int[n];
		q = new int[n];
	 for (i = 0;i < n;i++)
	 {
	   p[i] = String.valueOf(pp[i]).length();
	   q[i] = String.valueOf(qq[i]).length();
	 }
	 for (i = 0;i < n;i++)
	 {
	 jf(pp[i], p[i], qq[i], q[i]);
		System.out.print("\n");
	 }
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(pp[i]);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(pp);
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(qq[i]);
	 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(qq);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(q);
	}
}

