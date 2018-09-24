package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[500]);
	  str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  int i;
	  int size = str.length();
	  for (i = 1;i < size;i++)
	  {
		   int h;
		   int t;
		   for (h = 0;h < size - i;h++)
		   {
			 int h1 = h;
			 t = h + i;
			 int m;
			 for (;h1 < t;h1++,t--)
			 {
			 if (str.charAt(h1) != str.charAt(t))
			 {
			 break;
			 }
			 }
			 if (h1 > t)
			 {
			 for (m = h;m <= h + i;m++)
			 {
			 System.out.print(str.charAt(m));
			 }
			 System.out.print("\n");
			 }
		   }
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

