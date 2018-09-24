package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[5];
		  int b = 0;
	  do
	  {
		  a[b] = System.in.read();
		  b++;
	  } while (b < 5);
	  if (a[1] == '\n')
	  {
		  System.out.printf("%c",a[0]);
	  }
	  else if (a[2] == '\n')
	  {
		  System.out.printf("%c%c",a[1],a[0]);
	  }
	  else if (a[3] == '\n')
	  {
		  System.out.printf("%c%c%c",a[2],a[1],a[0]);
	  }
	  else if (a[4] == '\n')
	  {
		  System.out.printf("%c%c%c%c",a[3],a[2],a[1],a[0]);
	  }
	  else
	  {
		  System.out.print("00001");
	  }
	  return 0;
	}

}
