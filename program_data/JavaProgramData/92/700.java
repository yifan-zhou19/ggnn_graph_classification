package <missing>;

public class GlobalMembers
{
	public static void bubble(int[] a, int n)
	{
		 int pass;
		 int hold;
		 int j;
		 for (pass = 1;pass <= n - 1;pass++)
		 {
		 for (j = 0;j <= n - 2;j++)
		 {
		 if (a[j] < a[j + 1])
		 {
				  hold = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = hold;
		 }
		 }
		 }
	}
	public static int compare(Object a1, Object a2)
	{
		int i;
		return ((int)a2 - (int)a1);
	}
	public static int Main()
	{
		  int I;
		  for (I = 1;;I++)
		  {
			  int[] a;
			  int[] b;
			  int i;
			  int n;
			  int as;
			  int ae;
			  int bs;
			  int be;
			  int money1 = 0;
			  int money2 = 0;

			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  if (n == 0)
			  {
			  break;
			  }
			  else
			  {
				  a = new int[n];
				  b = new int[n];
				  for (i = 0;i <= n - 1;i++)
				  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
				  }
				  for (i = 0;i <= n - 1;i++)
				  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  b[i] = Integer.parseInt(tempVar3);
				  }
				  }
				  bubble(a, n);
				  qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
				  as = bs = 0;
				  ae = be = n - 1;
				  for (;as <= ae;)
				  {
							   if (a[ae] > b[be])
							   {
									 money1++;
									 ae--;
									 be--;
							   }
							   else if (a[ae] < b[be])
							   {
									 money2++;
									 ae--;
									 bs++;
							   }
							   else if (a[as] > b[bs])
							   {
									money1++;
									as++;
									bs++;
							   }
							   else if (a[as] < b[bs])
							   {
									money2++;
									ae--;
									bs++;
							   }
							   else if (a[ae] < b[bs])
							   {
									money2++;
									ae--;
									bs++;
							   }
							   else if (a[ae] > b[bs])
							   {
									money1++;
									ae--;
									bs++;
							   }
							   else
							   {
									ae--;
									as++;
							   }
				  }
				  System.out.printf("%d\n",200 * (money1 - money2));
			  }
		  }
	}




}

