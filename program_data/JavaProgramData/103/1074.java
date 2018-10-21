package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char c;
		  char x;
		  int n = 0;
		  c = System.in.read();
		  n = 1;
		  while (true)
		  {
				  if (c >= 'a' && c <= 'z')
				  {
					  c = c - 32;
				  }
				  x = System.in.read();
				  if (x >= 'a' && x <= 'z')
				  {
					  x = x - 32;
				  }
				  if (x == '\n')
				  {
							 System.out.printf("(%c,%d)",c,n);
							 break;
				  }
				  if (x == c)
				  {
					  n++;
				  }
				  else
				  {
					  System.out.printf("(%c,%d)",c,n);
					  c = x;
					  n = 1;
				  }
		  }
	}

}
