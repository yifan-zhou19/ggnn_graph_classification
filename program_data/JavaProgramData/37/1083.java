package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[1000]);
	   char q;
	   int[] ans = new int[30];
	   int n;
	   int i;
	   int flag;
	   int j;
	   int k;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   q = tempVar2.charAt(0);
	   }

	   for (i = 1;i <= n;i++)
	   {


			  for (j = 0;j < 30;j++)
			  {
				  ans[j] = 0;
			  }
			  flag = 0;

			  a = new Scanner(System.in).nextLine();


			  for (j = 0;j < a.length();j++)
			  {
				  ans[a.charAt(j) - 'a']++;
			  }

			  for (j = 0;j < a.length();j++)
			  {
				if (ans[a.charAt(j) - 'a'] == 1)
				{
					 System.out.printf("%c\n",a.charAt(j));
					 flag = 1;
					 break;
				}
			  }
			  if (flag == 0)
			  {
				  System.out.print("no\n");
			  }
	   }
	   return 0;
	}


}

