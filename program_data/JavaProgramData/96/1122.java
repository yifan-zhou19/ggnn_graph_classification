package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int l;
	  int[] c = new int[100];
	  int[] b = new int[100];
	  int[] d = new int[100];
	  String a = new String(new char[100]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  l = a.length();
	  for (i = 0;i < l - 1;i++)
	  {
	   b[i] = 0;
	  }

	  for (i = 0;i < l;i++)
	  {
	   c[i] = a.charAt(i) - '0';
	  }

	  if (l == 1)
	  {
		System.out.print("0\n");
		System.out.printf("%d",c[0]);
	  }
	  else
	  {
		  k = 10 * c[0] + c[1];
		  if (l == 2 && k < 13)
		  {
			System.out.printf("%d\n",0);
			System.out.printf("%d",k);
		  }
		   else
		   {
			 for (i = 0;i < l - 1;i++)
			 {
			  c[i + 1] = 10 * (c[i]) + c[i + 1];
			  b[i] = c[i + 1] / 13;
			  c[i + 1] = c[i + 1] % 13;
			 }

			if (b[0] == 0)
			{
			  for (i = 0;i < l - 2;i++)
			  {
				d[i] = b[i + 1];
				System.out.printf("%d",d[i]);
			  }
			}
		 else
		 {
		  for (i = 0;i < l - 1;i++)
		  {
			System.out.printf("%d",b[i]);
		  }
		 }
		  System.out.print("\n");
		  System.out.printf("%d",c[l - 1]);
		   }
	  }


	}
}

