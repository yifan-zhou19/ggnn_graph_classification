package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct p
	//  {
	//	  int k;
	//	  int count;
	//  }
	//  p[10000];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < n;i++)
	  {
		  p[i].count = 0;
	  }
	  while (!(a == 0 && b == 0))
	  {
		  p[b].count++;
		  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (int i = 0;i < n;i++)
	  {
		  if (p[i].count == n - 1)
		  {
			  System.out.print(i);
			  return 0;
		  }
	  }
	  System.out.print("NOT FOUND");
	}
}

