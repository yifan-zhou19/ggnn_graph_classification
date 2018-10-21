package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[10000]);
	   char b;
	   int n;
	   int i;
	   int flag = 0;
	   int j;
	   int k;
	   int r;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   System.in.read();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   a = malloc(n * (Character.SIZE / Byte.SIZE) * 10000);
	   for (i = 0;i < n;i++)
	   {
		   *(a.Substring(i)) = new Scanner(System.in).nextLine();
	   }
	   for (i = 0;i < n;i++)
	   {
		   k = String.valueOf(*(a.Substring(i))).length();
		   for (j = 0;j < k;j++)
		   {
			  b = (*(a.Substring(i)) + j);
			  for (r = 0;r < k;r++)
			  {
				  if (r == j)
				  {
					  continue;
				  }
				  else
				  {
					  if (b == *(*(a.Substring(i)) + r))
					  {
						  break;
					  }
				  }
			  }
			  if (r == k)
			  {
				  System.out.printf("%c\n",b);
				  flag = 1;
				  break;
			  }
		   }
		   if (flag == 0)
		   {
			   System.out.print("no\n");
		   }
		   flag = 0;

	   }

	}
}

