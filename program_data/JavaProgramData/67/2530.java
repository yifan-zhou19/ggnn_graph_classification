package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //cout<<setiosflags(ios::fixed)<<setprecision(4);
	  int n;
	  int i;
	  float a;
	  float b;
	  float cx;
	  float cd;
	  float c;
	  float c0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  c0 = b / a;
	  cx = c0 - 0.05;
	  cd = c0 + 0.05;
	  for (i = 1;i <= n - 1;i++)
	  {
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		  c = b / a;
		  if (c > cd - 1e-9)
		  {
			  System.out.print("better");
			  System.out.print("\n");
		  }
		  if (c < cx + 1e-9)
		  {
			  System.out.print("worse");
			  System.out.print("\n");
		  }
		  if ((c < cd - 1e-9) && (c> cx + 1e-9))
		  {
			  System.out.print("same");
			  System.out.print("\n");
		  }
	  }
	   return 0;
	}


}

