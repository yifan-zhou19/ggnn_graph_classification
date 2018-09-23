package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//    freopen ("1.txt","r",stdin);
	  //      freopen ("2.txt","w",stdout);
		   int i;
		   int len;
		   int lnum;
		   int num = 0;
		   int[] left = {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		   int[] fail = new int[102];
		   int t = 0;
		   String s1 = new String(new char[102]);
		   while (scanf("%s",s1) != EOF)
		   {
			System.out.printf("%s\n",s1);
			len = s1.length();
			lnum = 0;
			for (i = 0;i < len;i++)
			{
			   if (s1.charAt(i) == '(')
			   {
				   lnum++;
				   left[lnum] = i;
			   }

			   if (s1.charAt(i) == ')')
			   {
				   if (lnum == 0)
				   {
				   fail[i] = 2;
				   }
				   else
				   {
					   left[lnum] = -1;
					   lnum--;
				   }
			   }
			}
			for (i = 1;i <= lnum;i++)
			{
			   fail[left[i]] = 1;
			   left[i] = -1;
			}
		  //  printf("lnum=%d\n",lnum);
		   for (i = 0;i < len;i++)
		   {
			if (fail[i] > 0)
			{
			num++;
			}
		   }
			   for (i = 0;i < len && num>0;i++)
			   {
				 if (fail[i] == 2)
				 {
					  System.out.print("?");
					  num--;
					  t = 1;
				 }
				 if (fail[i] == 1)
				 {
					  System.out.print("$");
					  num--;
					  t = 1;
				 }
				 if (fail[i] == 0 && t == 1)
				 {
					System.out.print(" ");
				 }
					fail[i] = 0;
			   }
				t = 0;
				System.out.print("\n");
		   }
		   // getch();
		   return 0;
	}

}
