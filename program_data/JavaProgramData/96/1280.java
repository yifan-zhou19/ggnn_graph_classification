package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  int n = a.length();
		  int[] b = new int[101];
		  for (int i = 0;i < n;i++)
		  {
		  b[i] = a.charAt(i) - '0';
		  }
		  int[] s = new int[100];
		  if (n < 3)
		  {
			  System.out.printf("%d\n%d\n",Integer.parseInt(a) / 13,Integer.parseInt(a) % 13);
		  }
		  else
		  {
			  int i = 0;
			  while (i < n - 1)
			  {
				  if ((10 * b[i] + b[i + 1]) < 13)
				  {
					  s[i] = 0;
				  s[i + 1] = (100 * b[i] + 10 * b[i + 1] + b[i + 2]) / 13;
				  b[i + 2] = (100 * b[i] + 10 * b[i + 1] + b[i + 2]) % 13;
				  i += 2;
				  }
				  else
				  {
					  s[i] = (10 * b[i] + b[i + 1]) / 13;
				  b[i + 1] = (10 * b[i] + b[i + 1]) % 13;
				  i++;
				  }
			  }

		   if (s[0] == 0)
		   {
			   for (int i = 1;i < n - 1;i++)
			   {
				   System.out.printf("%d",s[i]);
			   }
		   }
		   else
		   {
			   for (int i = 0;i < n - 1;i++)
			   {
				   System.out.printf("%d",s[i]);
			   }
		   }
		   System.out.printf("\n%d",b[n - 1]);
		  }

	}
}

