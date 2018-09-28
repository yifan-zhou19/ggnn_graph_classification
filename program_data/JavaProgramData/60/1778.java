package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[1500];
	public static int Main()
	{
	  int x = 1;
	  int i = 0;
	  int j = 1;
	  int k = 0;
	  while (k < 1500)
	  {
		   while (j <= x)
		   {
			 if (x % j == 0)
			 {
			i = i + 1;
			 }
		  else
		  {
			i = i;
		  }
		  j = j + 1;
		   }
		 if (i == 2)
		 {
				s[k] = x;
			k = k + 1;
		 }
		 i = 0;
		 j = 1;
		 x = x + 1;
	  }
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n < 5)
	  {
		System.out.print("empty");
	  }
	  else
	  {
			 for (i = 1;i < 1500;i++)
			 {
				if (s[i] > n)
				{
				 break;
				}
			 if (s[i] - s[i - 1] == 2)
			 {
				System.out.printf("%d %d\n",s[i - 1],s[i]);
			 }
			 }
	  }
	  return 0;
	}
}

