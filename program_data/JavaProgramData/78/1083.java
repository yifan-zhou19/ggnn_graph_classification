//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int z;
	 int q;
	 int s;
	 int l;
	 int min;
	 int smin;
	 int smax;
	 int max;
	 for (z = 1;z <= 5;z++)
	 {
	  for (q = 1;q <= 5;q++)
	  {
	   for (s = 1;s <= 5;s++)
	   {
		for (l = 1;l <= 5;l++)
		{
		 if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
		  {
		   if (z + q == s + l)
		   {
			 if (z + l > s + q)
			 {
			  if (z + s < q)
			   {
				min = z;
				if (q < min)
				{
				 min = q;
				}
				if (s < min)
				{
				 min = s;
				}
				if (l < min)
				{
				 min = l;
				}
				max = z;
				if (q > max)
				{
				 max = q;
				}
				if (s > max)
				{
				 max = s;
				}
				if (l > max)
				{
				 max = l;
				}
			   if ((z - min) * (z - max) * (q - min) * (q - max) != 0)
			   {
				if (z > q)
				{
				smax = z;
				smin = q;
				}
				else
				{
				 smin = z;
				 smax = q;
				}
			   }
			   if ((z - min) * (z - max) * (s - min) * (s - max) != 0)
			   {
				if (z > s)
				{
				smax = z;
				smin = s;
				}
				else
				{
				 smin = z;
				 smax = s;
				}
			   }
			   if ((z - min) * (z - max) * (l - min) * (l - max) != 0)
			   {
				if (z > l)
				{
				smax = z;
				smin = l;
				}
				else
				{
				 smin = z;
				 smax = l;
				}
			   }
			   if ((q - min) * (q - max) * (s - min) * (s - max) != 0)
			   {
				if (s > q)
				{
				smax = s;
				smin = q;
				}
				else
				{
				 smin = s;
				 smax = q;
				}
			   }
			  if ((l - min) * (l - max) * (q - min) * (q - max) != 0)
			  {
				if (l > q)
				{
				smax = l;
				smin = q;
				}
				else
				{
				 smin = l;
				 smax = q;
				}
			  }
			   if ((s - min) * (s - max) * (l - min) * (l - max) != 0)
			   {
				if (s > l)
				{
				smax = s;
				smin = l;
				}
				else
				{
				 smin = l;
				 smax = l;
				}
			   }
			  if (z == max)
			  {
				System.out.print("z");
				System.out.print(" ");
				System.out.print(z * 10);
				System.out.print("\n");
			  }
			   if (q == max)
			   {
				System.out.print("q");
				System.out.print(" ");
				System.out.print(q * 10);
				System.out.print("\n");
			   }
			   if (s == max)
			   {
				System.out.print("s");
				System.out.print(" ");
				System.out.print(s * 10);
				System.out.print("\n");
			   }
			   if (l == max)
			   {
				System.out.print("l");
				System.out.print(" ");
				System.out.print(l * 10);
				System.out.print("\n");
			   }
			   if (z == smax)
			   {
				System.out.print("z");
				System.out.print(" ");
				System.out.print(z * 10);
				System.out.print("\n");
			   }

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
