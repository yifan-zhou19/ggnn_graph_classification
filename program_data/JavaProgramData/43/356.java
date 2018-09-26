package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m; //m??;n?m???;i,t=??=??,i<t;a?????
	int n;
	int i;
	int t;
	int a;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (m % 2 != 0)
	{
	System.out.print("input error");
	}
	else
	{
		  n = m / 2;
	   for (i = 3,t = m - i;i <= n;i++,t--)
	   {
			 for (a = 2;a < i;a++)
			 {
			   if (i % a != 0)
			   {
				   ;
			   }
			else
			{
			  break;
			}
			 }
		   if (a == i)
		   {
			  for (a = 2;a < t;a++)
			  {
					if (t % a != 0)
					{
						;
					}
				 else
				 {
				   break;
				 }
			  }
			  if (a == t)
			  {
				 System.out.print(i);
				 System.out.print(' ');
				 System.out.print(t);
				 System.out.print('\n');
			  }
			  else
			  {
				  ;
			  }
		   }
			else
			{
				;
			}
	   }
	}
	System.in.read();
	System.in.read();
	return 0;
	}
}

