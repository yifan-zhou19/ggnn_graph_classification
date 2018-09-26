package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a;
	  int count = 0;
	  int b;
	  int x = 0;
	  int m = 0;
	  int[] s = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 3;i <= n;i++)
	  {

		for (a = 2;a <= i / 2 + 1;a++)
		{
			if ((i % a) != 0)
			{
				 m = m + 1;
			}
		}
		if (m == i / 2)
		{
			s[count] = i;
			count = count + 1;
			m = 0;
		}
		else
		{
			m = 0;
		}

	  }




	  for (b = 0;b <= count - 1;b++)
	  {
		   if (s[b + 1] == s[b] + 2)
		   {
			   System.out.printf("%d %d\n",s[b],s[b + 1]);
			   x = x + 1;
		   }
	  }
	   if (x == 0)
	   {
	   System.out.print("empty");
	   }

	}

}

