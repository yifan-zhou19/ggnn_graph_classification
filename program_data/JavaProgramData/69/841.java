//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class num
{
   public int x;
   public num nxt;
}

package <missing>;

public class GlobalMembers
{
	public static void Create()
	{
	  pHeader = new num();
	  pHeader.nxt = null;
	} //????
	public static void Store(num p, int x)
	{
	  num p1;
	  p1 = new num();
	  p1.nxt = p.nxt;
	  p1.x = x;
	  p.nxt = p1;
	} //???????
	public static int Main()
	{
	  String c1 = new String(new char[200]);
	  String c2 = new String(new char[200]);
	  int i;
	  int x1;
	  int x2;
	  int n;
	  int s = 0;
	  Create();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  c2 = tempVar2.charAt(0);
	  }
	  for (i = 0;c1.charAt(i) != '\0';i++)
	  {
		  x1 = i;
	  }
	  for (i = 0;c2.charAt(i) != '\0';i++)
	  {
		  x2 = i; //???????
	  }
	  if ((c1.charAt(0) != '-' && c2.charAt(0) != '-') || (c1.charAt(0) == '-' && c2.charAt(0) == '-')) //????
	  {
		  if (c1.charAt(0) == '-' && c2.charAt(0) == '-')
		  {
			for (i = 0;i < x1;i++)
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i + 1));
			}
			for (i = 0;i < x2;i++)
			{
				c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i + 1));
			}
			x1--;
			x2--;
			System.out.print("-");
		  } //?2?????2???
		  n = (x1 > x2); //????
		  if (n == 0)
		  {
			if (x1 == x2)
			{
				for (i = 0;i < x1;i++)
				{
					s += c1.charAt(x1 - i) - '0' + c2.charAt(x2 - i) - '0';
					Store(pHeader, s % 10);
					s = s / 10;
				} //????????,??,??
				c2 = tangible.StringFunctions.changeCharacter(c2, 0, c2.charAt(0) + (c1.charAt(0) - '0') + s);
				Store(pHeader, (int)(c2.charAt(0) - '0')); //?????????
			}
			else
			{
			for (i = 0;i <= x1;i++)
			{
				s += c1.charAt(x1 - i) - '0' + c2.charAt(x2 - i) - '0';
				Store(pHeader, s % 10);
				s = s / 10;
			} //????????,??,??
			c2 = tangible.StringFunctions.changeCharacter(c2, x2 - x1 - 1, c2.charAt(x2 - x1 - 1) + s);
			s = 0;
			for (i = (x2 - x1 - 1);i > 0;i--)
			{
				s += c2.charAt(i) - '0';
				Store(pHeader, s % 10);
				s = s / 10;
			} //???10????????
			c2.charAt(0) += s;
			Store(pHeader, c2.charAt(0) - '0'); //?????????
			}
		  }
		  else
		  {
			for (i = 0;i <= x2;i++)
			{
				s += c1.charAt(x1 - i) - '0' + c2.charAt(x2 - i) - '0';
				Store(pHeader, s % 10);
				s = s / 10;
			} //????????,??,??
			c1 = tangible.StringFunctions.changeCharacter(c1, x1 - x2 - 1, c1.charAt(x1 - x2 - 1) + s);
			s = 0;
			for (i = (x1 - x2 - 1);i > 0;i--)
			{
				s += c1.charAt(i) - '0';
				Store(pHeader, s % 10);
				s = s / 10;
			} //???10????????
			c1.charAt(0) += s;
			Store(pHeader, c1.charAt(0) - '0'); //?????????
		  }
	  }
	  else if (c1.charAt(0) == '-' || c2.charAt(0) == '-') //????
	  {
			if (c1.charAt(0) == '-')
			{
				for (i = 0;i < x1;i++)
				{
					c1 = tangible.StringFunctions.changeCharacter(c1, i, c1.charAt(i + 1));
				}
				x1--;
				n = 1;
			}
			if (c2.charAt(0) == '-')
			{
				for (i = 0;i < x2;i++)
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, i, c2.charAt(i + 1));
				}
				x2--;
				n = 2;
			} //???????
			if (x1 < x2)
			{
				for (i = 0;i <= x1;i++)
				{
					s = c2.charAt(x2 - i) - '0' - (c1.charAt(x1 - i) - '0');

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


