package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k = 0;
		  int a;
		  int b;
		  int i;
		  int h = 0;
		  int c;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int e[100];
		  int[] e = new int[100];
		  String n = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  c = n.length();
		  for (i = 0;i <= c - 1;i++)
		  {
				if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
				{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - ('0' - 0));
				}
				if (n.charAt(i) <= 'Z' && n.charAt(i) >= 'A')
				{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - ('A' - 10));
				}
				if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
				{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 10);
				}
				h = a * h + n.charAt(i);
		  }
		  if (h == 0)
		  {
		  System.out.print("0");
		  }
		  for (i = 0;h > 0;i++)
		  {
				e[i] = h % b;
				h = h - e[i];
				h = h / b;
				k = k + 1;
		  }
		  for (i = 0;i <= k - 1;i++)
		  {
				n = tangible.StringFunctions.changeCharacter(n, i, e[k - 1 - i]);
				if (n.charAt(i) > 9)
				{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 'A' - 10);
				}
				else
				{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + '0');
				}
		  }
		  n = tangible.StringFunctions.changeCharacter(n, k, '\0');
		  System.out.printf("%s\n",n);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	return 0;
	}
}

