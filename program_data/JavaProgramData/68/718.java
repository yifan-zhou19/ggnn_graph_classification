package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int t;
		int m;
		int s;
		for (i = 6;i <= n;i = i + 2)
		{
			  for (k = 2;k <= i;k++)
			  {
					m = (int) Math.sqrt(k);

					for (j = 2 ; j <= m ; j++)
					{
						  if (k % j == 0)
						  {
						  break;
						  }
					}
					if (j == m + 1) //??k???
					{
						  s = (int) Math.sqrt(i - k);
						  for (t = 2;t <= s;t++)
						  {
								if ((i - k) % t == 0)
								{
								break;
								}
						  }
						  if (t == s + 1) //??n-k????
						  {
							  System.out.print(i);
							  System.out.print("=");
							  System.out.print(k);
							  System.out.print("+");
							  System.out.print(i - k);
							  System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							  goto end;
						  }

					}
			  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  end:
			  ;
		}


		return 0;
	}
}

