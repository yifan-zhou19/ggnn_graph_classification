package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int c;
		  int[] b = new int[100];
		  int len;
		  int d;
		  String a = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
	for (k = 1;k <= n;k++)
	{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  len = a.length();
		  for (c = 0;c <= len - 1;c++)
		  {
			  b[c] = 0;
		  }
		  for (c = 0;c <= len - 1;c++)
		  {
		   for (d = 0;d <= len - 1;d++)
		   {
				if (a.charAt(c) == a.charAt(d))
				{
				b[c]++;
				}
				else
				{
					;
				}
		   }
			//printf("%d\n",b[c]);
			if (b[c] == 1)
			{
				   System.out.printf("%c\n",a.charAt(c));
				   break;
			}
			else
			{
				;
			}
		  }
		  if (c == len)
		  {
		  System.out.print("no\n");
		  }
		  else
		  {
			  ;
		  }
		  //for(c=0;c<=n-1;c++)
		 // {
		 //printf("%d\n",d[c]);
		 //      }

	}

	}
}

