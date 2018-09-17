package <missing>;

public class GlobalMembers
{
	public static int s;
	public static void search(int a,int k)
	{
		  if (a == 0)
		  {
		  return;
		  }
		  if (a == 1)
		  {
		  return;
		  }
	 for (int i = 2;i < a;i++)
	 {
	   if (a % i == 0 && a / i >= i != 0 && i >= k != 0 && a / i >= k)
	   {
	   s++;
	   search(a / i, i);
	   }
	 }
	 return;
	}
	public static int Main()
	{
	int n;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	s = 1;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	search(a, 1);
	System.out.print(s);
	System.out.print("\n");
	}


	  return 0;
	}

}

