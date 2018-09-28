package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int t = 1;
	 int p = 1;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i1 = 3;i1 <= m / 2;i1 = i1 + 2)
	 {
		 t = 1;
		 p = 1;
	  for (int k1 = 2;k1 <= Math.sqrt(i1);k1++)
	  {
	   int q1 = i1 % k1;
	   t = t * (q1 != 0);
	  } //????????????
	  if (t == 1)
	  {
	   int i2 = m - i1;
	   for (int k2 = 2;k2 <= Math.sqrt(i2);k2++)
	   {
		  int q2 = i2 % k2;
		  p = p * (q2 != 0);
	   } //??????????
	   if (p == 1)
	   {
		System.out.print(i1);
		System.out.print(" ");
		System.out.print(i2);
		System.out.print("\n");
	   }
	   else
	   {
		continue;
	   }
	  }
	  else
	  {
	   continue;
	  }
	 }
	}

}

