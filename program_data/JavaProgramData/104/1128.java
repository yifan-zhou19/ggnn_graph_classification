package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f(int m,int n)
	{
	  if (m < n)
	  {
		return f(m,n / 2);
	  }
	  else if (m > n)
	  {
		return f(m / 2,n);
	  }
	  else
	  {
	  return m;
	  }
	}

	public static void Main(String[] args)
	{
	  int x;
	  int y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  x = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  y = Integer.parseInt(tempVar2);
	  }
	  System.out.printf("%d",f(x,y));
	}

}

