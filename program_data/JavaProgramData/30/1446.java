package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 float a;
	 float b;
	 float c;
	 float d;
	 float e;
	 float s = 0F;
	 for (i = 1;i <= n;i++)
	 {
	  a = i % 7;
	  if (a == 0F)
	  {
		  s = s + 0;
	  }
	  else
	  {
		  b = i % 10;
			c = b / 7;

			if (c == 1F)
			{
				s = s + 0;
			}
			else
			{
				d = i - b;
				 e = d / 70;

				 if (e == 1F)
				 {
					 s = s + 0;
				 }
				 else
				 {
					 s = s + i * i;
				 }
			}
	  }
	 }

	 System.out.print(s);
	 System.out.print("\n");
	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

